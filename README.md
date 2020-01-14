#Creation of a monolithic and micro services springboot flight reservation application

##In the monolothic application :
We created four models: user, vol, plane and reservation. We created the different controllers and services and we managed to test them using the Postman. The dependencies used are Spring Data JPA, H2database , lombok , Devtools, Spring Actuator.
	
##In the microservices application :
We have created 3 microservices we have combined the plane and the volin the same microservice called logistic and we created the two others:  User and reservation. Then we created a eureka server (config server) to make the relation between the different microservices.
The communication between the different micro services is done by the REST API through the Eureka server.  
Finally we containerized the different micro services to obtain a docker image for each project.

Key words : Spring Data Jpa,Spring Cloud,H2 database, lombok, Spring Actuator,Jib,Eureka server,docker



