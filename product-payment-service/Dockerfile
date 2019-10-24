FROM openjdk:8-jdk-alpine
MAINTAINER Sachin Sadasivan <sachin.sadasivan@gmail.com>
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /product-payment-service/lib
COPY ${DEPENDENCY}/META-INF /product-payment-service/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /product-payment-service
ENTRYPOINT ["java","-cp","product-payment-service:product-payment-service/lib/*","io.sachinsadasivan.microservices.examples.productpaymentservice.ProductPaymentServiceApplication"]
