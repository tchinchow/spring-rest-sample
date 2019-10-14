Simple HelloWorld rest API

### **Change tomcat server port**
Add the following lines in the "`application.properties`" file:
```properties
server.port=tomcatport
server.address=yourserver
```

### **Configure the H2 database**
Add the following lines in the "`application.properties`" file:
```properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2
```
There also are a lot of other options you can tune:
```properties
# spring.datasource.url=jdbc:h2:mem:AZ;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
# spring.datasource.url=jdbc:h2:file:~/testdb
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
# spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```


### **Launch the application**
```
mvn spring-boot:run
```

### **Use the application**
Once the server is running you can:
- go to `http://yourserver:tomcatport/h2` and browse the database.
- Use [PostMan](https://www.getpostman.com/) to craft requests for your API:

#### HelloWorld Service
| Method | URL | Parameters | Result |
|--------|-----|------------|--------|
| GET    | `/api/helloworld` | _none_ | "Hello "World" |
| GET    | `/api/helloworld/{id}` | id=1 | "Hello bob" |

#### Users Service
| Method | URL | Parameters |
|--------|-----|------------|
| GET    | `/api/users` | _none_ |
| POST   | `/api/users` | name=bob&age=72 |
| PUT    | `/api/users/{id}` | name=marzel&age=18 |
| DELETE | `/api/users/{id}` | _none_ |
