FROM openjdk:8

EXPOSE 8080

ADD target/usermanagementapp.jar usermanagementapp.jar

ENTRYPOINT ["java","-jar","/usermanagementapp.jar"]