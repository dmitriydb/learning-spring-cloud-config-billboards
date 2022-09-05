## Description
Simple showcase of using Spring Cloud Config module.

In this app a config server provides configuration parameters (text formatting options such as bold, italic, uppercase flags etc.) for two services that returns some arbitrary text to the client via HTTP endpoint.  

## Services

### Billboards config server

Provides text configuration properties for two microservices: `billboard-taxi` and `billboard-ads`

Properties looks like that:

Property name|Property value|
|------------|-------------|
|uppercase|true|
|bold|false|
|italic|true|

### Billboard taxi service

Returns the text like *777030 Taxi Call now!* with its own formatted params gotten from config server 

Uses endpoint: `http://localhost:9001/say`

### Billboard ads service

Returns the text like *Buy stuff! Call 440330 now!* with its own formatted params gotten from config server

Uses endpoint: `http://localhost:9002/say`


