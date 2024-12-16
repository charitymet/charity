# Demonstrate Dependency Injection and Bean Scopes in a Spring Application

---

## 1. Singer.java

```java
package edu.met.p1;

public class Singer {
    private int sid;
    private String sname;

    // Default Constructor
    public Singer() {
    }

    // Parameterized Constructor
    public Singer(int sid, String sname) {
        super();
        this.sid = sid;
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Singer [sid=" + sid + ", sname=" + sname + "]";
    }
}
```

---

## 2. appctx.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans
    xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:p="http://www.springframework.org/schema/p"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

    <bean id="singer" class="edu.met.p1.Singer" scope="prototype">
        <constructor-arg value="101" />
        <constructor-arg value="Om" />
    </bean>

</beans>
```

---

## 3. SingerImpl.java

```java
package edu.met.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingerImpl {
    static ApplicationContext ctx;

    public static void main(String[] args) {
        ctx = new ClassPathXmlApplicationContext("appctx.xml");

        Singer s1 = (Singer) ctx.getBean("singer");
        System.out.println(s1);

        Singer s2 = (Singer) ctx.getBean("singer");
        s2.setSid(102);
        s2.setSname("Neha");
        System.out.println(s2);
    }
}
```

---

## 4. Output

- **Scope: Singleton**
  - The same instance of the bean is shared across the application.
- **Scope: Prototype**
  - A new instance of the bean is created each time it is requested from the container.
