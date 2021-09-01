FROM openjdk:8

EXPOSE 8090

ADD target/employeemanager-0.0.1-SNAPSHOT.jar usermanagementapp.jar

ENTRYPOINT ["java","-jar","/usermanagementapp.jar"]