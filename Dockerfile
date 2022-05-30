FROM eclipse-temurin:17
VOLUME /tmp
COPY target/demo_999-0.0.1-SNAPSHOT.jar demo_999-0.0.1-SNAPSHOT.jar
CMD [“java”,”-Djava.security.egd=file:/dev/./urandom”,”-jar”,”/demo_999-0.0.1-SNAPSHOT.jar”]