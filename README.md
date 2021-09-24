# java-web
Simple Java Spring Web project as a playground 


## Getting Started
### Starting application directly
- start server navigate to project root
```
./mvnw spring-boot:run
```

``` 
curl -X GET "localhost:8080/hello?firstName=Brenden"
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

### Start Mongo
- start command
```
docker run -d -p 27017:27017 --name mongodb  mongo
```
- stop command
```
docker stop mongodb
docker rm mongodb
```
- or expand to a docker compose yaml in the future
``` yaml
# Use root/example as user/password credentials
version: '3.1'

services:

  mongo:
    image: mongo
    restart: always
    environment:
      MONGO_INITDB_ROOT_USERNAME: root
      MONGO_INITDB_ROOT_PASSWORD: example

  mongo-express:
    image: mongo-express
    restart: always
    ports:
      - 8081:8081
    environment:
      ME_CONFIG_MONGODB_ADMINUSERNAME: root
      ME_CONFIG_MONGODB_ADMINPASSWORD: example
      ME_CONFIG_MONGODB_URL: mongodb://root:example@mongo:27017/
```


## References
- https://spring.io/quickstart
- https://spring.io/guides/gs/rest-service/
- https://hub.docker.com/_/mongo