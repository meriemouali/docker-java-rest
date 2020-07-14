FROM openjdk:11
VOLUME /tmp
ADD /target/*.jar app.jar
EXPOSE 8080
CMD ["-jar","/app.jar"]
ENTRYPOINT [ "java" ]