# Spring Cloud Microservices Examples

This is an example Product Catalog Service Application based on Microservice Architecture. This Application is based in Service Discovery and Load Balancing.

These Microservices can be containerized easily. The Dockerfile is part of each Microservices.

## Product Catalog Service

Product Catalog Service is a Spring Boot Microservice which communicate with other Microservices to fetch data using REST.
It then orchastrate and produce a REST API which other clients can use.

## Product Info Service

Product Info Service is a Spring Boot Microservice which prvides Product Information using productId. It provides a REST API to recive productId and then return the corresponding Product Information.

## Product Payment Service

Product Payment Service is a Spring Boot Microservice which prvides Product Payment using productId. It provides a REST API to recive productId and then return the corresponding Product Payment Information.

## Discovery Service

Discovery Service is a Spring Boot Discovery Microservice. It enables the Service Discovery for the registerd clients.

## Containerizing Microservices

### Tag a Microservice
You can tag a Microservice by executing below Docker command

Syntax:
```
docker build -t <tag>/<microservice-name>:latest .
```
Example:

```
docker build -t sachinsadasivan/product-catalog-service:latest .

```

### Build Microservice Image
You can build a tagged docker image using the command line like this:
```
$ mvn install dockerfile:build
```
If you do not have maven installed, use the below command

```
$ ./mvnw install dockerfile:build
```

### Run a Containarized Docker Microservice Image

Execute the command:

Syntax:
```
docker run  <tag>/<microservice-name>
```
Example:
```
docker run  sachinsadasivan/product-catalog-service
```

If you want to specify the port

Syntax
```
docker run -p <port>:<port> <tag>/<microservice-name>
```

Example:
```
docker run -p 8080:8080 sachinsadasivan/product-catalog-service
```

## Technologies
Project is created with:
* Spring Boot
* Spring Cloud
* Docker

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
