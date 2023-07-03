# Lombok
Springboot Java REST app using Lombok

Build the artifact jar file

```
./mvnw clean package -DskipTests   
```

Copy the the jar from target directory to the root of the application

```
cp /Users/{user}/IdeaProjects/Lombok/target/Lombok-0.0.1-SNAPSHOT.jar   /Users/{user}/IdeaProjects/Lombok/
```

To build the application
```
docker-compose build –no-cache
```
To run the application

```
docker-compose up
```


Run the following from Postman to test the API end points:

```
POST localhost:8080/api/student/create
```
with JSON Body

```
{
"first_name": "Joe",
"lastName": "Test",
"email": "Joe@test.com",
"Street": "Mt Carmel",
"city": "Irvine"

}
```
To get the list of students run the following in Postman

```
GET localhost:8080/api/student/getAll
```
