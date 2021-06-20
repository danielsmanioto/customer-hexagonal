# customer-hexagonal

This project use a hexagonal (ports and adapter) architecture for organize the design of our application.

References: https://reflectoring.io/spring-hexagonal/

# Organization

Basic application using package organization

<b>Domains</b> : Rules and Use Case of our application
<b>Adapters:</b>  Every this we need to expose. examples end points.
<b>Ports: </b> Contracts of our Models and Use Case and our Adapters 

# Tecnologies

Jdk16<br>
Spring Boot<br> 

# Executing

`gradle clean bootRun`

`curl http://localhost:8080/customers`

