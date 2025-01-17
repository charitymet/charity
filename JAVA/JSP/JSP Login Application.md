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
### Steps to Create and Populate a Database Table in pgAdmin

---

#### 1. Open pgAdmin
- Search for **pgAdmin** on your computer and launch it.
- When prompted, enter the password: `password`.

![pgAdmin Screenshot](https://github.com/user-attachments/assets/a4ccadd4-de03-48fb-9134-bf08a0343416)

---

#### 2. Open Query Tool in pgAdmin
- In the left panel, select the database `postgres`.
- Right-click on it and choose **Query Tool**.

![Query Tool Screenshot](https://github.com/user-attachments/assets/4cdab345-6efc-4386-886c-5bc46008009d)

---

#### 3. Create a Table
- In the Query Tool, type the following SQL command to create the `users` table:

```sql
CREATE TABLE users (
    uid INTEGER,
    name VARCHAR(100),
    password VARCHAR(100)
);
```

- Click the **Execute/Run** button to execute the command.

---

#### 4. Insert Data into the Table
- After creating the table, use the following SQL command to insert a record into the table:

```sql
INSERT INTO users VALUES (102, 'Priya', '12345');
```

- Click the **Execute/Run** button to execute the command.

![Insert Data Screenshot](https://github.com/user-attachments/assets/6d32fe7b-9bec-4d27-b5a0-8f15a34ea38f)

---

#### 5. Run Your Application
- After creating and populating the database table, run the application from **Eclipse** or your preferred IDE.

---

#### Notes
- Ensure that the database credentials in your application match those used in pgAdmin.
- Verify that the `users` table and its data are correctly set up before testing the application.


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
