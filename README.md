# Spring Cloud Microservices Examples

This is an example Product Catalog Service Application based on Microservice Architecture. This application uses Spring Cloud

## Product Catalog Service

Product Catalog Service is a Spring Boot Microservice which communicate with other Microservices to fetch data using REST.
It then orchastrate and produce a REST API which other clients can use.

## Product Info Service

Product Info Service is a Spring Boot Microservice which prvides Product Information using productId. It provides a REST API to recive productId and then return the corresponding Product Information.

## Product Payment Service

Product Payment Service is a Spring Boot Microservice which prvides Product Payment using productId. It provides a REST API to recive productId and then return the corresponding Product Payment Information.

## Discovery Service

Discovery Service is a Spring Boot Discovery Microservice. It enables the Service Discovery for the registerd clients.


