### Steps to Create a JSP Login Application

---

#### 1. Create `Login.jsp`

This JSP file serves as the login page where users enter their credentials.

```jsp
<%@ page language="java" %>
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
                <td>Enter Username: </td>
                <td><input type="text" name="txtUname"></td>
            </tr>
            <tr>
                <td>Enter Password: </td>
                <td><input type="password" name="txtPwd"></td>
            </tr>
            <tr>
                <td>
                    <input type="reset" name="btnReset" value="Reset">
                </td>
                <td>
                    <input type="submit" name="btnSub" value="Submit">
                </td>
            </tr>
        </form>
    </table>
</body>
</html>
```

---

#### 2. Create `CheckLogin.jsp`

This JSP file validates the username and password.

```jsp
<%@ page language="java" %>
<html>
<body>
<%
// Fetch username and password
String un = request.getParameter("txtUname");
String pwd = request.getParameter("txtPwd");

// Validate username and password
if (un.equals("Priya") && pwd.equals("12345")) {
%>
    <jsp:forward page="Welcome.jsp"></jsp:forward>
<%
} else {
%>
    <jsp:forward page="InvalidUser.jsp"></jsp:forward>
<%
}
%>
</body>
</html>
```

---

#### 3. Create `Welcome.jsp`

This JSP file displays a welcome message upon successful login.

```jsp
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h1>Welcome <%= request.getParameter("txtUname") %></h1>
</body>
</html>
```

---

#### 4. Create `InvalidUser.jsp`

This JSP file handles invalid login attempts.

```jsp
<html>
<head>
    <title>Invalid User</title>
</head>
<body>
    <h1>Incorrect Username or Password!</h1>
    <a href="Login.jsp">Try Again</a>
</body>
</html>
```

---

### Optional: Code with Database Connectivity

---

#### Update `Login.jsp`

Modify the form action to point to `CheckLoginDB.jsp`:

```jsp
<form action="CheckLoginDB.jsp">
```

---

#### Create `CheckLoginDB.jsp`

This JSP file uses a database to validate the username and password.

```jsp
<%@ page language="java" import="java.sql.*" %>
<html>
<body>
<%
// Step 1: Load the Driver
try {
    Class.forName("org.postgresql.Driver");
} catch (Exception ex) {
    out.println(ex.getMessage());
}

try {
    // Step 2: Create a Connection
    Connection conn = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/postgres", "postgres", "password");

    // Step 3: Fetch username and password
    String un = request.getParameter("txtUname");
    String pwd = request.getParameter("txtPwd");

    // Step 4: Create statement object
    Statement stmt = conn.createStatement();
    String sql = "SELECT * FROM users WHERE uid='" + un + "'";

    // Step 5: Execute the Query
    ResultSet rs = stmt.executeQuery(sql);
    if (rs.next()) {
        // Validate username and password
        if (un.equals(rs.getString(1)) && pwd.equals(rs.getString(2))) {
%>
        <jsp:forward page="Welcome.jsp"></jsp:forward>
<%
        } else {
%>
        <jsp:forward page="InvalidUser.jsp"></jsp:forward>
<%
        }
    } else {
%>
    <jsp:forward page="InvalidUser.jsp"></jsp:forward>
<%
    }
} catch (Exception ex) {
    out.println(ex.getMessage());
}
%>
</body>
</html>
```

---

### Output Scenarios

1. **Static Validation**:
   - Enter username: `Priya`
   - Enter password: `12345`
   - Redirects to the `Welcome.jsp` page.
   - Invalid credentials redirect to the `InvalidUser.jsp` page.

2. **Database Validation**:
   - User credentials are verified against the database.
   - On success, the user is redirected to the `Welcome.jsp` page.
   - Invalid credentials redirect to the `InvalidUser.jsp` page.
