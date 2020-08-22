# spring-security-demo

TEST THE APPLICATION
====================
0. Before running the application, make sure the database tables are set up (via SQL files).  Also, be sure to update application.properties for database connection (url, userid, pass)
 
1. Run the Spring Boot application: ThymeleafdemoApplication.java

2. Open a web browser for the app: http://localhost:8080

3. Log in using one of the accounts

user id | password | roles 
--- | --- | --- |
user | fun123 | ROLE_EMPLOYEE 
moderator | fun123 | ROLE_EMPLOYEE, ROLE_MANAGER 
admin | fun123 | ROLE_EMPLOYEE, ROLE_ADMIN 

4. Confirm that you can login and access data based on the roles.

app that uses Spring Boot, Spring Security (JDBC), Thymeleaf, Spring Data JPA
