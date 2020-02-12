from elasticsearch import Elasticsearch, RequestsHttpConnection
from requests_aws4auth import AWS4Auth
import boto3

host = 'vpc-cp-delius-spike-v2ies23n47fcp3z7drjr2eqcgi.eu-west-2.es.amazonaws.com'
region = 'eu-west-2'

sts_client = boto3.client('sts')
assumed_role_object=sts_client.assume_role(
    RoleArn="arn:aws:iam::434401102446:role/ES_User",
    RoleSessionName="AssumeRoleSession1"
)
credentials = assumed_role_object['Credentials']
awsauth = AWS4Auth(credentials['AccessKeyId'], credentials['SecretAccessKey'], region, 'es', session_token=credentials['SessionToken'])

es = Elasticsearch(
    hosts = [{'host': host, 'port': 443}],
    http_auth = awsauth,
    use_ssl = True,
    verify_certs = True,
    connection_class = RequestsHttpConnection
)

document = {
    "title": "1917",
    "director": "Sam Mendes",
    "year": "2019"
}

es.index(index="movies", doc_type="_doc", id="5", body=document)

print(es.get(index="movies", doc_type="_doc", id="5"))
