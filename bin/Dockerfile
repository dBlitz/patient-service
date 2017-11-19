FROM openjdk
MAINTAINER Devin Blitzer <devblitzer@gmail.com>
ADD target/patient-service.jar patient-service.jar
ENTRYPOINT ["java", "-jar", "/patient-service.jar"]
EXPOSE 2222