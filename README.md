login:
http://localhost:8080/home

user name configured in code
password

it will show home page

---------------------------------

Steps:
pom xml:
1. spring-boot-starter-security
2. spring-boot-starter-web
   ---
Create Security class
@Configuration
cretae bean for filter chain method(invoke .http default methods)
cretae bean for userobject with user credtz
