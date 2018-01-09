# GET OAUTH using maven
```mvn compile
```

## to get acccess token
```
mvn exec:java@run-login-example -Dapp_id=APP_ID -Dapp_secret=APP_SECRET
```


# REST FB OAUTH
Rest API using spring


##Gradle

Run the application using 

```
./gradlew bootRun
```

Build the jar

```
./gradlew build
```

Run the Jar after build

```
 java -jar target/fcebook-oauth-1.0.jar
```



##Maven

Run the application using 

```
./mvnw spring-boot:run
```

Build the JAR file

```
 ./mvnw clean package
 ```


 Run the jar after maven build
```
 java -jar target/fcebook-oauth-1.0.jar
 ```



##Run the app

```
 http://localhost:8080/greeting
 ```