FROM openjdk:8
VOLUME /tmp
ADD build/libs/gateway-service-0.0.1-SNAPSHOT.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE ${PORT}
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]