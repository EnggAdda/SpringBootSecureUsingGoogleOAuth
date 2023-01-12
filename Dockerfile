FROM openjdk:17
EXPOSE 9090
ADD target/spring-boot-oauth.jar  spring-boot-oauth.jar
ENTRYPOINT ["java","-jar","/spring-boot-oauth.jar"]