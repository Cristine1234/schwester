#
# Build stage
#
FROM maven:3.8.1-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/schwester-backend.jar /usr/local/app/schwester-backend.jar
EXPOSE 8087
ENTRYPOINT ["java","-jar","/usr/local/app/schwester-backend.jar"]
