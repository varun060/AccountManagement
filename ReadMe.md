This project is done for demonstrating skills in Java,Springboot,MySQL and JPA .

Project is to get 
1) all Account details stored in database 
2) transactions related to a particular account stored database

Project is having Application layer and Database Layer

Database Layer
----------------
MYSQL is used to create database and it stores all account details in one table and related transaction in other table.
transaction table is having a foreign key reference to account and it is a many to one cardinality from transaction to account
For the purpose of normilization, only transaction details are kept in transaction table and account details are stored in account table

Application Layer
-----------------

Application is built using Springboot which helps faster creation of spring project with inbuilt TomCat server.
Application is deployed as an executable jar and up on execution, web server will be initiated automatically.
Spring boot dependencies are specified in POM.xml
Application layer can be scaled using Springboot Micro service arch.. like Eureka(Registry) and zuul

Application Design
------------------
MVC architecture is followed to meet the goal.
Controller will get requests from UI/Browser/CURL and after initial validation, it sends requests to service layer.
Service layer gets data from DAO repository layer and applies business logic to form expected results.
Repository gets details from DB using JPA and returns objects mapped to relational database tables.
Accounts and Transactions are having separate repositories for handling DB interaction
ORM models are also defined to map tables with objects.





