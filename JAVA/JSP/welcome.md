//////// Display the current date and time ///////
Creating a jsp application:
Go to--> File>New>Other click on other
![Screenshot 2024-12-16 at 9 27 49 PM](https://github.com/user-attachments/assets/e4f65c4e-c133-49d7-b59a-f019d9e6ea4c)
Go to--> search in the box for``` Dynamic Web Project``` click on next
![Screenshot 2024-12-16 at 9 36 47 PM](https://github.com/user-attachments/assets/b6273af3-f5ac-48ec-9be6-52525e650203)
Set Project Name:
![Screenshot 2024-12-16 at 9 38 51 PM](https://github.com/user-attachments/assets/208953e2-5f08-4b9d-8a4a-0db421307dc3)
Set Target runtime: to 8.5 by clicking the new runtime button & Go to--> Apache > choose tomcat server 8.5 
![Screenshot 2024-12-16 at 9 41 14 PM](https://github.com/user-attachments/assets/65569771-d5d0-46dd-a7c9-722364d17963)
![Screenshot 2024-12-16 at 9 40 52 PM](https://github.com/user-attachments/assets/8b10438e-7735-4cca-9c22-a5df87d1a4a0)
click on next,
Again click on next
*** click on Generate web.xml deployment descriptor the click Finish(Open in perspective yes if popped on screen)
![Screenshot 2024-12-16 at 9 46 01 PM](https://github.com/user-attachments/assets/e47489f5-4c92-4c9b-9dad-58061e1ffc32)
Select the root project (Welcome)>New>other click on other
![Screenshot 2024-12-16 at 9 51 05 PM](https://github.com/user-attachments/assets/f566b921-7ca6-4a53-921e-2eb548c9b195)
search in the box for``` JSP File``` click on next
Set the name of jsp file to ```index.jsp```
![Screenshot 2024-12-16 at 9 55 20 PM](https://github.com/user-attachments/assets/29870a5d-4ad6-4e51-be1a-261365fa0d87)
 click on next,
 Choose JSP with xhtml markup
![Screenshot 2024-12-16 at 9 57 39 PM](https://github.com/user-attachments/assets/2f02b26c-9764-4f34-b003-042cd9f9a4f7)
 click on finish
 Inside index.jsp copy below code
```
### Index.html
<%@ page language="java" import="java.util.*" %>
<html>
<head>First JSP Application</head>
<body>
<h1>Welcome to MET</h1>
<hr><br>
The current Date and Time is : <%= new Date() %>
</body>
</html>
```
Output: A screen with text showing "Welcome to MET" & shows current date & time
![Screenshot 2024-12-16 at 9 10 46 PM](https://github.com/user-attachments/assets/32716a84-b58a-4a08-8c1c-de86027df70d)
