# springboot-web-app-mysql
Steps:-
1.  Create a spring boot project (https://start.spring.io)
    a.  JDK=21
    b.  Add dependencies:-
      1.	web
	    2.	actuator
	    3.	test
	    4.	jpa
	    5.	mysql
	    6.	lombok
2. Install MySQL DB
    a.  setup credentials
    b.  create ems schema
    c.  create Employee table or let application to create it
4. Edit application.properties for DB details
5. Run mvn spring-boot:run
6. App should be ready to use with base URL http://localhost:8080/api/employee
7. Use repo https://github.com/devendra80/reactjs to integrate as frontend app
8. Happy coding
