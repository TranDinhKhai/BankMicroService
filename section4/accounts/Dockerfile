##Start with a base image containing Java runtiom
#FROM openjdk:17-jdk-slim
#
##Information around who maintains the image
#MAINTAINER eazybytes.com
#
##Add the application's jar to the image
#COPY target/accounts-0.0.1-SNAPSHOT.jar /app/accounts-0.0.1-SNAPSHOT.jar
#WORKDIR /app
##execute the application
#ENTRYPOINT["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]


FROM openjdk:17-jdk-slim
MAINTAINER eazybytes.com
VOLUME /tmp
ENV tom=dev
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dprofile=${tom}","-jar","accounts-0.0.1-SNAPSHOT.jar"]
