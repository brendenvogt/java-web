# java-web
Simple Java Spring Web project as a playground 


## Getting Started
### Starting application directly
- start server navigate to project root
```
./mvnw spring-boot:run
```

``` 
curl -X GET "localhost:8080/hello?name=Brenden"
# Hello Brenden!%
```

### Generate Jar
- generate target jar 
```
./mvnw clean package
# output saved to ./target/
```
- run jar with
```
java -jar target/<JAR_FILE>.jar
```

## References
- https://spring.io/quickstart
- https://spring.io/guides/gs/rest-service/