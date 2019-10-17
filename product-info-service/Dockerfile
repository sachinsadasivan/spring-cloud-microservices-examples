FROM openjdk:8-jdk-alpine
MAINTAINER Sachin Sadasivan <sachin.sadasivan@gmail.com>
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /product-info-service/lib
COPY ${DEPENDENCY}/META-INF /product-info-service/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /product-info-service
ENTRYPOINT ["java","-cp","product-info-service:product-info-service/lib/*","io.sachinsadasivan.microservices.examples.productinfoservice.ProductInfoServiceApplication"]
