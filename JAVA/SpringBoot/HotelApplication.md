# Spring Boot Hotel Project Setup Tutorial

## Project Creation Steps

### 1. Create New Spring Starter Project

1. Open your IDE (e.g., IntelliJ IDEA, Eclipse)
2. Navigate to File > New > Other
3. Select Spring Starter Project

![Spring Starter Project Selection](https://github.com/user-attachments/assets/55ef1cf6-9ee2-4b66-84c7-e3110a35c337)

### 2. Enter Project Details

1. Enter project name
2. Choose project type as Maven
3. Click Next

### 3. Select Dependencies

#### Web Dependencies
Search for web and select:
- Spring Web
- Spring Reactive Web
- Spring Web Services

![Web Dependencies Selection](https://github.com/user-attachments/assets/bf549056-e4f9-46bf-b0e1-02f12183047f)

#### Database Dependencies
1. Search for H2, select H2 Database

![H2 Database Selection](https://github.com/user-attachments/assets/a8b54789-e844-4a3c-a66f-325a309665ce)

2. Search for development tools, select Spring Boot DevTools

![Development Tools Selection](https://github.com/user-attachments/assets/542f1bda-a610-4ea2-87a7-11f66666582b)

3. Search for PostgreSQL, select PostgreSQL Driver

![PostgreSQL Driver Selection](https://github.com/user-attachments/assets/328282f1-4918-4c92-9596-de8935af8455)

4. Search for JDBC, select:
- JDBC API
- Spring Data JDBC

![JDBC Dependencies Selection](https://github.com/user-attachments/assets/29c543d6-00e1-4d6b-bbd9-04a9c72b70bd)

### 4. Confirm Dependencies

Ensure all 8 dependencies are selected

![Final Dependencies Selection](https://github.com/user-attachments/assets/26cdff77-4c4c-4c0f-abb9-cedca26c5215)

5. Click Finish and wait for packages to install

## Project Code

### Hotel.java
```java
package edu.met.p1;

public class Hotel {
    int hid;
    String hname;
    int price;

    public Hotel() {}

    public Hotel(int hid, String hname, int price) {
        this.hid = hid;
        this.hname = hname;
        this.price = price;
    }

    // Getters and Setters
    public int getHid() { return hid; }
    public void setHid(int hid) { this.hid = hid; }
    public String getHname() { return hname; }
    public void setHname(String hname) { this.hname = hname; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}
```

### HotelController.java
```java
package edu.met.p1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HotelController {
    @Autowired
    HotelRepository hotelRepository;

    @GetMapping("/gethotel")
    public List<Hotel> getAll() {
        return hotelRepository.getAll();
    }
    
    @RequestMapping(value="/gethotel/{id}", method = RequestMethod.GET)
    public List<Hotel> getById(@PathVariable("id") String id) {
        return hotelRepository.getById(id);
    }
}
```

### HotelRepository.java
```java
package edu.met.p1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HotelRepository {
    @Autowired
    JdbcTemplate jdbcT;

    public List<Hotel> getAll() {
        String sel = "select * from hotel";
        return jdbcT.query(sel, new HotelRowMapper());
    }

    public List<Hotel> getById(String id) {
        String sel = "select * from hotel where hid=" + Integer.parseInt(id);
        return jdbcT.query(sel, new HotelRowMapper());
    }
}
```

### HotelRowMapper.java
```java
package edu.met.p1;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class HotelRowMapper implements RowMapper<Hotel> {
    @Override
    public Hotel mapRow(ResultSet rs, int rowNum) throws SQLException {
        Hotel h1 = new Hotel();
        h1.setHid(rs.getInt(1));
        h1.setHname(rs.getString(2));
        h1.setPrice(rs.getInt(3));
        return h1;
    }
}
```

### Application Properties Configuration

Navigate to `src/main/resources/application.properties`

![Application Properties Location](https://github.com/user-attachments/assets/fd695764-d110-4489-a4a9-921d4d67d95e)

Add the following configuration:

![Application Properties Configuration](https://github.com/user-attachments/assets/2169c3e4-e771-49f6-a691-c8c626d203ae)

```properties
spring.application.name=HotelApplication
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=password
```
