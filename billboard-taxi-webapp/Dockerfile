FROM adoptopenjdk/openjdk15
ADD target/billboard-taxi-webapp-1.0-SNAPSHOT.jar .
CMD java -jar -Dspring.profiles.active=heroku billboard-taxi-webapp-1.0-SNAPSHOT.jar
EXPOSE 9003