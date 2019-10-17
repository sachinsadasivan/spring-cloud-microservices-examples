FROM openjdk:8-jdk-alpine
MAINTAINER Sachin Sadasivan <sachin.sadasivan@gmail.com>
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /product-discovery-service/lib
COPY ${DEPENDENCY}/META-INF /product-discovery-service/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /product-discovery-service
ENTRYPOINT ["java","-cp","product-discovery-service:product-discovery-service/lib/*","io.sachinsadasivan.examples.microservices.productdiscoveryserver.ProductDiscoveryServerApplication"]
