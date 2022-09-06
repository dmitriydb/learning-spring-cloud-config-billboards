## Description
Simple showcase of using Spring Cloud Config and Netflix module.

In this app a config server provides configuration parameers (text formatting options such as bold, italic, uppercase flags etc.) for two services that returns some arbitrary text to the client via HTTP endpoint.

Discovery of server config service is provided by Netflix Eureka.

## Services

### Billboards config server

Provides text configuration properties for two microservices: `billboard-taxi` and `billboard-ads`

Run locally in docker environment and also deployed at [Heroku](https://billboard-config-server.herokuapp.com/)

Properties looks like that:

Property name|Property type|Description|
|------------|-------------|-----------|
|uppercase|boolean|Show text in uppercase|
|bold|boolean|Show text in bold|
|italic|boolean|Show text in italic|
|heroku|boolean|Heroku-specific property|


### Billboard taxi service

Returns the text like *777030 Taxi Call now!* with its own formatted params gotten from config server 

Uses endpoint: `http://localhost:9001/say`

### Billboard ads service

Returns the text like *Buy stuff! Call 440330 now!* with its own formatted params gotten from config server

Uses endpoint: `http://localhost:9002/say`

### Billboards Eureka server

Service Discovery service built with Spring Cloud Netflix module. 

Is used for config server discovering by respective clients. 

## How to run the demo

Run following commands:

`git clone https://github.com/dmitriydb/learning-spring-cloud-config-billboards`

`cd learning-spring-cloud-config-billboards`

`mvn package`

`docker compose up`

Or use existing Jenkinsfile in the repo to create your own Jenkins pipeline. 

## Deploying cloud config server to heroku

Login into your Heroku account in your command line and run commands:

`git clone https://github.com/dmitriydb/learning-spring-cloud-config-billboards`

`cd learning-spring-cloud-config-billboards`

`git checkout heroku`

`heroku git:remote -a <your Heroku app name>`

`git push heroku heroku:master`



## Deploying heroku clients

To deploy clients that working with Heroku cloud config server run commands:

`git clone https://github.com/dmitriydb/learning-spring-cloud-config-billboards`

`cd learning-spring-cloud-config-billboards`

`git checkout heroku`

`mvn package`

`docker compose up`

Clients use endpoints `http://localhost:9003/say` and `http://localhost:9004/say`