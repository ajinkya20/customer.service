FROM java:8

EXPOSE 9001

ADD target/customer.service-0.0.1-SNAPSHOT.jar customer-docker.jar

ENTRYPOINT ["java","-jar","customer-docker.jar"]