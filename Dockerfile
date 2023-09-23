#
# Build stage
#
FROM maven:3.8.3-openjdk-11 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
EXPOSE 9090
ENTRYPOINT ["java","-jar","/home/app/target/authentication-0.0.1-SNAPSHOT.jar"]


