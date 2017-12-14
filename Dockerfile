FROM openjdk:8-jre-alpine

COPY notifications/target /usr/src/dostavca/notifications

WORKDIR /usr/src/dostavca/notifications

EXPOSE 8080

CMD ["java", "-server", "-cp", "classes:dependency/*", "com.kumuluz.ee.EeApplication"]