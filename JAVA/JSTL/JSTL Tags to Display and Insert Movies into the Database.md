# Write a JSP Program Using JSTL Tags to Display and Insert Movies into the Database

---

## 1. DisplayMovies.jsp

This JSP file retrieves and displays all movies from the database.

```jsp
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Display All Movies</title>
</head>
<body>
    <h1>Display Movies</h1>
    <sql:setDataSource var="myDs" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/postgres" user="postgres" password="password" />
    <!-- Query to Retrieve Movies -->
    <sql:query var="rs" dataSource="${myDs}">SELECT * FROM Movies</sql:query>
    <table border="1">
        <thead>
            <tr>
                <th>MID</th>
                <th>Title</th>
                <th>Director</th>
                <th>Duration</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="row" items="${rs.rows}">
                <tr>
                    <td><c:out value="${row.mid}" /></td>
                    <td><c:out value="${row.mname}" /></td>
                    <td><c:out value="${row.director}" /></td>
                    <td><c:out value="${row.duration}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
```

---

## 2. InsertMovies.jsp

This JSP file provides a form to insert new movies into the database.

```jsp
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Insert a Movie</title>
</head>
<body>
    <h1>Insert into Movies Table</h1>
    <form action="AddMovie.jsp">
        <table>
            <tr>
                <td>Movie Id:</td>
                <td><input type="text" name="mid" /></td>
            </tr>
            <tr>
                <td>Movie Name:</td>
                <td><input type="text" name="mname" /></td>
            </tr>
            <tr>
                <td>Movie Director:</td>
                <td><input type="text" name="director" /></td>
            </tr>
            <tr>
                <td>Movie Duration:</td>
                <td><input type="text" name="duration" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Insert" /></td>
            </tr>
        </table>
    </form>
</body>
</html>
```

---

## 3. AddMovie.jsp

This JSP file handles the insertion of a new movie into the database.

```jsp
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Results Page</title>
</head>
<body>
    <!-- Parse Input Values -->
    <fmt:parseNumber var="intmid" value="${param.mid}" />
    <fmt:parseNumber var="intdur" value="${param.duration}" />
    <!-- Set Data Source -->
    <sql:setDataSource var="myDs" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/postgres" user="postgres" password="password" />
    <!-- Execute Insert Query -->
    <sql:update var="rowCnt" dataSource="${myDs}">
        INSERT INTO movies(mid, mname, director, duration) VALUES (?, ?, ?, ?);
        <sql:param value="${intmid}" />
        <sql:param value="${param.mname}" />
        <sql:param value="${param.director}" />
        <sql:param value="${intdur}" />
    </sql:update>
    <!-- Success Message -->
    <p>Movie inserted successfully!</p>
    <a href="InsertMovies.jsp">Add Another Movie</a>
</body>
</html>
```

---

## 4. Database Setup

### Create Table in PostgreSQL

Run the following commands in your PostgreSQL database:

```sql
CREATE TABLE movies (
    mid INTEGER,
    mname VARCHAR(50),
    director VARCHAR(50),
    duration INTEGER
);

INSERT INTO movies VALUES (102, '3 Idiots', 'Rajkumar Hirani', 210);
```

---

## Output

1. **DisplayMovies.jsp**: Displays a table with all movies from the database.
2. **InsertMovies.jsp**: Provides a form to add new movies.
3. **AddMovie.jsp**: Inserts new movies and confirms the addition with a success message.
