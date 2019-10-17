FROM openjdk:8-jdk-alpine
MAINTAINER Sachin Sadasivan <sachin.sadasivan@gmail.com>
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /product-catalog-service/lib
COPY ${DEPENDENCY}/META-INF /product-catalog-service/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /product-catalog-service
ENTRYPOINT ["java","-cp","product-catalog-service:product-catalog-service/lib/*","io.sachinsadasivan.examples.microservices.productcatalogservice.ProductCatalogServiceApplication"]
