FROM openjdk:8

EXPOSE 8090

ADD target/usermanagementapp.jar usermanagementapp.jar

ENTRYPOINT ["java","-jar","/usermanagementapp.jar"]