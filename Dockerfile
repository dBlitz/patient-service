FROM openjdk
MAINTAINER Devin Blitzer <devblitzer@gmail.com>
ADD patient-service.jar patient-service.jar
ENTRYPOINT ["java", "-jar", "/patient-service.jar"]
EXPOSE 2222
