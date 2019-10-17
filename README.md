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
$ ./mvnw install dockerfile:build
```

## Technologies
Project is created with:
* Spring Boot
* Spring Cloud
* Docker

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
