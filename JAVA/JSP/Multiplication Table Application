### Steps to Create a Multiplication Table Application

---

#### 1. Create `index.html` 
### ** make index.html in lower caps only

This HTML file will collect input from the user.

```html
<!DOCTYPE html>
<html>
<head>
    <title>Multiplication Table Application</title>
    <meta charset="ISO-8859-1">
</head>
<body>
    <hr>
    <form action="MulTable.jsp">
        Enter a Number: <input type="text" name="txtNum"><br>
        <input type="submit" name="btnSubmit" value="Submit">
    </form>
</body>
</html>
```

---

#### 2. Create `MulTable.jsp`

This JSP file will generate and display the multiplication table.

```jsp
<%@ page language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Multiplication Table</title>
</head>
<body>
    <h2>Multiplication Table</h2>
    <hr>
    <% 
    // Step 1: Fetch the number from Index.html
    String val = request.getParameter("txtNum");
    int num = Integer.parseInt(val);
    %>
    <table border="1">
        <tr>
            <th>Multiplication Table of <%= num %></th>
        </tr>
        <%
        // Step 2: Generate the multiplication table using a loop
        for (int i = 1; i <= 10; i++) {
        %>
        <tr>
            <td><%= num %> * <%= i %> = <%= num * i %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
```

---

#### 3. Create `ShowError.jsp`

This JSP file handles errors if invalid input is provided.

```jsp
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Error Page</title>
</head>
<body>
    <h1>OOPS! Something went wrong!</h1>
    <p>Error: <%= exception.getMessage() %></p>
    <a href="Index.html">Try Again</a>
</body>
</html>
```

---

#### Output Scenarios

1. **For Valid Input**
   - Enter a number (e.g., `5`) in the input field.
   - A table displaying the multiplication table for the number will be shown.

2. **For Invalid Input**
   - Enter an invalid value (e.g., `op`) in the input field.
   - The `ShowError.jsp` page will display an error message.

---
