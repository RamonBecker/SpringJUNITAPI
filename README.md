# SpringJUNITAPI

 
## :information_source: Information 

Project developed with Spring Boot, Spring Data JPA, Hibernate, Mockito, JUnit 5 and H2 Database. The DTO (Data Transfer Objects) and MVC standards were used. I'll leave my POSTMAN collections in the repository for consumption by the project endpoints.

Some features developed:

- Creation of a user CRUD Rest API;

- Automated tests with 100% project code coverage;

- Validations with Spring Validation;

- Using Lombok and ModelMapper to eliminate boilerplate code

- Implementation of test and development profiles;

- Custom exception handling


## ⚠️ Prerequisite
[![Java Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/br/java/technologies/javase-downloads.html) >= 17


![Spring Badge](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

![Spring Boot Badge](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)

![JSON Badge](https://img.shields.io/badge/json-5E5C5C?style=for-the-badge&logo=json&logoColor=white)

![h2-logo-2 (1)](https://user-images.githubusercontent.com/44611131/136869740-c514d30e-d529-4167-a459-4fcd647cce19.png)

![JSON Badge](https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)

![JPA-hibernate (1)](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

![Postman Badge](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white) OR ![Insomnia Badge](https://img.shields.io/badge/Insomnia-5849be?style=for-the-badge&logo=Insomnia&logoColor=white)



##  🔧 Install 


![](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)


```
git clone https://github.com/RamonBecker/SpringJUNITAPI.git
```

![](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)
```
git clone https://github.com/RamonBecker/SpringJUNITAPI.git
or install github https://desktop.github.com/ 
```

## 🔨 POSTMAN

To test the end points you will need to install POSTMAN or Insomnia. I recommend installing POSTMAN. I'll leave the collections on the DRIVE to facilitate testing.

Download and import collections into your POSTMAN: 
```
https://drive.google.com/file/d/1cxAaM5MhwwDUdmilla_Fh3jb6JKufJq6/view?usp=sharing

```


## ⚙️ Testing the project


To test the project you will need to clone the repository on your machine. You can choose both tools: postman or insomnia.
```
To download postman go to the following link: https://www.postman.com/downloads/
```
```
To download insomnia rentre from the following link: https://insomnia.rest/download
```
Remembering that you must choose the operating system corresponding to your machine.
After you have made your registration in these tools, run them and you must type the following in the address: 
```
localhost:8080/user/
```
according to the image below, to perform, for example, the GET operation, to search for all users in the database.


The following HTPP methods were implemented: PUT, DELETE, GET and POST.

The example was performed using Postman.

![teste](https://user-images.githubusercontent.com/44611131/150437315-3287b32f-c7b4-4e44-b354-15e2f6a48b31.PNG)


## Accessing the H2 database


If you want to modify the user to access the database, modify the application.properties file.
Change the following:
```
spring.datasource.username=user
spring.datasource.password=password
```

Access in browser
```
http://localhost:8080/h2-console
```
If the JDBC URL is not configured, replace it with:
```
jdbc:h2:mem:testdb
```
![h2](https://user-images.githubusercontent.com/44611131/137225410-277de0f7-cf7c-48b1-b9e4-9be2d5b4ff43.PNG)


## :zap: Technologies	

- Java
- JPA
- Hibernate
- Spring Boot
- H2 Database
- Design Pattern MVC
- Design Pattern DTO
- Lombok
- Mockito
- JUnit 5

## :memo: Developed features

- [x] CRUD User
- [x] Automated tests for the Rest API


## :technologist:	 Author

By Ramon Becker 👋🏽 Get in touch!



[<img src='https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/github.svg' alt='github' height='40'>](https://github.com/RamonBecker)  [<img src='https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/linkedin.svg' alt='linkedin' height='40'>](https://www.linkedin.com/in/https://www.linkedin.com/in/ramon-becker-da-silva-96b81b141//)
![Gmail Badge](https://img.shields.io/badge/-ramonbecker68@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:ramonbecker68@gmail.com)
