FROM adoptopenjdk/openjdk15
ADD target/billboard-ads-webapp-1.0-SNAPSHOT.jar .
CMD java -jar -Dspring.profiles.active=production billboard-ads-webapp-1.0-SNAPSHOT.jar
EXPOSE 9002