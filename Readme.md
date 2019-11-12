
***Java Skeleton Project***
This is an example project to be used to create Springboot Api's

**Contents:**
 - Root folder - Readme, Jenkins file, SonarQube properties file
 - Service - in the service folder is the reference spring project and a docker file to bundle the service up
 - Integration - in the integration folder is an example test project
 - Configuration - in the configuration folder is an example docker file which configures items for the service such as database setup.

**Using**
To use this, copy this repository into a new one

 1. Update the parameters in the jenkinsfile
 2. Update the parameters in the sonarqube file
 3. Update the Readme
 4. Open up the service project and  perform a find and replace on "yourorg" and "example" and replace with suitable values.
 5. Repeat this for the integration test project
 6. Open up the docker file in the configuration folder and modify as required

**Updating this project:**
It is important to keep this project up to date, and this can be done via PR's, please check when you use this project if any dependencies need updating.
