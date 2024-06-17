# Makersharks Assessment
Implemented a user registration and user details fetch endpoints for a RESTful API using Spring Boot.

Steps to run->
1. Clone the repository
2. Open the project in your IDE.
3. Run the project.
4. I have used H2 database.
   * Url to access H2 database - http://localhost:8080/h2-console
   * Login to the H2 console with these details -
   - JDBC URL: jdbc:h2:mem:testdb
   - Username: Azara
   - Password: @1234
6. Documentation of API using Swagger -
   * Url - http://localhost:8080/swagger-ui/index.html

# API Endpoints
This section provides the curl commands to interact with the user API.(These curl commands work in windows)
1. Register a New User
* Description: This endpoint registers a new user.
* Method: POST
* URL: http://localhost:8080/api/user/register

* Request Headers:
- Content-Type: application/json
- accept: application/json
- Request Body:

id (integer): User ID
userName (string): User's name
email (string): User's email address
password (string): User's password

* Curl Command: 
```sh
curl -X POST "http://localhost:8080/api/user/register" \
     -H "accept: application/json" \
     -H "Content-Type: application/json" \
     -d "{\"id\": 0, \"userName\": \"Azara\", \"email\": \"azara@gmail.com\", \"password\": \"9876\"}" 
```
2. Fetch All Users
* Description: This endpoint retrieves all registered users.
* Method: GET
* URL: http://localhost:8080/api/user/fetchall

* Request Headers:
- accept: application/json

* Curl Command:
curl -X GET "http://localhost:8080/api/user/fetchall" -H "accept: application/json"

3. Fetch User by Username
* Description: This endpoint retrieves a user by their username.
* Method: GET
* URL: http://localhost:8080/api/user/fetch?username=Azara

* Request Parameters:
- username (string): The username of the user to retrieve
* Request Headers:
- accept: application/json

* Curl Command:
curl -X GET "http://localhost:8080/api/user/fetch?username=Azara" -H "accept: application/json"
