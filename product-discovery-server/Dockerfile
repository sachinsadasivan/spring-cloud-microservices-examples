FROM openjdk:8-jdk-alpine
MAINTAINER Sachin Sadasivan <sachin.sadasivan@gmail.com>
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /product-discovery-server/lib
COPY ${DEPENDENCY}/META-INF /product-discovery-server/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /product-discovery-server
ENTRYPOINT ["java","-cp","product-discovery-server:product-discovery-server/lib/*","io.sachinsadasivan.microservices.examples.productdiscoveryserver.ProductDiscoveryServerApplication"]
