import boto3
import base64
from botocore.exceptions import ClientError
from boto3.session import Session

secret_name = "cp-test-secret"
region_name = "eu-west-2"

# Assume the role in the delius account
sts_client = boto3.client('sts')
assumed_role_object=sts_client.assume_role(
    RoleArn="arn:aws:iam::434401102446:role/CP_Test",
    RoleSessionName="AssumeRoleSession1"
)
session = Session(aws_access_key_id=assumed_role_object['Credentials']['AccessKeyId'],
                  aws_secret_access_key=assumed_role_object['Credentials']['SecretAccessKey'],
                  aws_session_token=assumed_role_object['Credentials']['SessionToken'])

# Create a Secrets Manager client
client = session.client(
    service_name='ssm',
    region_name=region_name
)

# Retrieve a secret
parameter = client.get_parameter(Name=secret_name, WithDecryption=True)
print(parameter['Parameter']['Value'])

