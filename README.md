# Lombok
Springboot Java REST app using Lombok

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
