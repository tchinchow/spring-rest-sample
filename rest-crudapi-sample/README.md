Simple HelloWorld rest API

### **Change tomcat server port**
Add the following lines in the "`application.properties`" file:
```properties
server.port=tomcatport
server.address=yourserver
```

### **Launch the application**
```
mvn spring-boot:run
```

### **Use the application**
Once the server is running you can:
- go to `http://yourserver:tomcatport/h2` and browse the database.
- Use [PostMan](https://www.getpostman.com/) to craft requests for your API:

| Method | URL | Parameters | Result |
|--------|-----|------------|--------|
| GET    | `/api/helloworld` | _none_ | "Hello "World" |
| GET    | `/api/helloworld/{name}` | name=bob | "Hello bob" |
