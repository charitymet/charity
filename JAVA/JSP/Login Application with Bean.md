### Steps to Create a Login Application with Bean

---
###Go to -> > Project root-> Right Click> New> Class 

![Screenshot 2024-12-17 at 12 26 21 AM](https://github.com/user-attachments/assets/664536a5-53e0-487b-a87d-5df6815231dd)

###Enter package name as edu.met.p1
###& class name as UserBean.java

![Screenshot 2024-12-17 at 12 24 39 AM](https://github.com/user-attachments/assets/76d694fc-5844-40cd-a3dd-57f73e112e5c)

#### 1. Create `UserBean.java`

Define a Java Bean to handle the username, password, and validation logic.

```java
package edu.met.p1;

public class UserBean {
    private String uname;
    private String password;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserBean() {
        // Default constructor
    }

    // Validate the username and password
    public boolean validate() {
        return this.uname.equals("Shanti") && this.password.equals("1234");
    }
}
```

---

#### 2. Create `Login.jsp`

This JSP file provides a form for the user to enter their credentials.

```jsp
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head>
    <title>Login Application</title>
</head>
<body>
    <h2>Login Page</h2>
    <hr>
    <table border="1">
        <form action="CheckLogin.jsp">
            <tr>
                <td>Enter Username:</td>
                <td><input type="text" name="uname"></td>
            </tr>
            <tr>
                <td>Enter Password:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="reset" value="Reset"></td>
                <td><input type="submit" value="Login"></td>
            </tr>
        </form>
    </table>
</body>
</html>
```

---

#### 3. Create `CheckLogin.jsp`

This JSP file validates the user's input using the `UserBean`.

```jsp
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head>
</head>
<body>
    <jsp:useBean id="userBean" class="edu.met.p1.UserBean" />
    <jsp:setProperty property="*" name="userBean" />
    <% if (userBean.validate()) { %>
        <jsp:forward page="Welcome.jsp" />
    <% } else { %>
        <jsp:forward page="InvalidUser.jsp" />
    <% } %>
</body>
</html>
```

---

#### 4. Create `Welcome.jsp`

This JSP file displays a welcome message for valid users.

```jsp
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h1>Welcome <%= request.getParameter("uname") %></h1>
</body>
</html>
```

---

#### 5. Create `InvalidUser.jsp`

This JSP file displays an error message for invalid users.

```jsp
<html>
<head>
    <title>Error Page</title>
</head>
<body>
    <h1>Incorrect Username or Password!</h1>
    <a href="Login.jsp">Try Again!</a>
</body>
</html>
```

---

### Create a Counter Application Using Session

---

#### 1. Create `CounterUsingSession.jsp`

This JSP file tracks the number of user visits using a session attribute.

```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session Counter</title>
</head>
<body>
    <%! int cnt = 0; %>
    Session Id: <%= session.getId() %>
    <%
    // Display message based on session state
    if (session.getAttribute("cntr") == null) {
        // Create session attribute for the counter
        session.setAttribute("cntr", "1");
        out.println("<h1>This is Your First Visit!</h1>");
    } else {
        // Fetch and increment the counter
        cnt = Integer.parseInt(session.getAttribute("cntr").toString());
        cnt++;
        out.println("<h1>This is Your Visit Number: " + cnt + "</h1>");
        // Update the counter in the session
        session.setAttribute("cntr", "" + cnt);
    }
    %>
</body>
</html>
```

---

### Output

1. **Login Application**
   - Valid credentials (`Shanti` / `1234`) redirect to `Welcome.jsp`.
   - Invalid credentials redirect to `InvalidUser.jsp`.

2. **Session Counter Application**
   - Tracks and displays the number of visits for each session.
   - Displays a welcome message for the first visit and visit count for subsequent visits.
