### Display the Current Date and Time

#### Creating a JSP Application

1. **Create a New Project**

   - Go to **File > New > Other**.
     
     ![Step 1 Screenshot](https://github.com/user-attachments/assets/e4f65c4e-c133-49d7-b59a-f019d9e6ea4c)

   - In the dialog box, search for `Dynamic Web Project` and click **Next**.
   
   - *If you don’t see `Dynamic Web Project`, refer to the [Errors Handling](#errors-handling) section below.*

2. **Set Up the Project**

   - Set the project name.
     
     ![Set Project Name Screenshot](https://github.com/user-attachments/assets/208953e2-5f08-4b9d-8a4a-0db421307dc3)

   - Set the target runtime to **Tomcat Server 8.5**:
     
     - Click the **New Runtime** button.
     - Go to **Apache > Tomcat Server 8.5**.
     
     - *If the runtime is not available, refer to the [Errors Handling](#errors-handling) section below.*
     
     ![Set Runtime Screenshot](https://github.com/user-attachments/assets/65569771-d5d0-46dd-a7c9-722364d17963)

3. **Generate Deployment Descriptor**

   - Click **Next**, then click **Next** again.
   
   - Check the box for **Generate web.xml deployment descriptor** and click **Finish**.
   
   - *If prompted, select "Open in Perspective".*
     
     ![Generate Deployment Descriptor Screenshot](https://github.com/user-attachments/assets/e47489f5-4c92-4c9b-9dad-58061e1ffc32)

4. **Create a JSP File**

   - Select the root project folder (e.g., `Welcome`) and go to **New > Other**.
     
     ![Create JSP File Step Screenshot](https://github.com/user-attachments/assets/f566b921-7ca6-4a53-921e-2eb548c9b195)

   - Search for `JSP File` and click **Next**.
   
   - Set the name of the file to `index.jsp`.
     
     ![Set JSP File Name Screenshot](https://github.com/user-attachments/assets/29870a5d-4ad6-4e51-be1a-261365fa0d87)

   - Click **Next** and choose **JSP with XHTML markup**.
     
     ![Choose JSP Template Screenshot](https://github.com/user-attachments/assets/2f02b26c-9764-4f34-b003-042cd9f9a4f7)

   - Click **Finish**.

5. **Add Code to `index.jsp`**

   - Inside the `index.jsp` file, copy and paste the following code:

```jsp
<%@ page language="java" import="java.util.*" %>
<html>
<head>First JSP Application</head>
<body>
<h1>Welcome to MET</h1>
<hr><br>
The current Date and Time is: <%= new Date() %>
</body>
</html>
```

6. **Output**

   - A screen will display the text `Welcome to MET` and the current date and time.
     
     ![Output Screenshot](https://github.com/user-attachments/assets/32716a84-b58a-4a08-8c1c-de86027df70d)

---

### Errors Handling

1. **If `Dynamic Web Project` is Not Found**:

   - Go to **Help > Eclipse Marketplace** and wait for it to load.
     
     ![Eclipse Marketplace Step Screenshot](https://github.com/user-attachments/assets/2d5788ec-f9b5-4724-86fe-0cc5da47810b)

   - In the **Popular** tab, find and install `Eclipse Java EE Developer Tools`.
     
     ![Install Java EE Tools Screenshot](https://github.com/user-attachments/assets/e8699d85-63f5-4d69-a214-9d63c690bb67)

   - Accept the terms and complete the installation.

2. **If Runtime is Not Found**:

   - Click **New Runtime** and choose **Apache**.
     
     ![New Runtime Step Screenshot](https://github.com/user-attachments/assets/24e3b469-70a1-4892-bca1-ef7504ff37d0)

   - Select **Apache Tomcat v8.5** and click **Next > Finish**.
     
     ![Choose Apache Tomcat Screenshot](https://github.com/user-attachments/assets/c0fd7df0-2c4e-46f0-9765-1bdba8890edd)
     
     ![Finish Runtime Setup Screenshot](https://github.com/user-attachments/assets/d0b992e7-49b2-463d-959b-48a6bda68dc0)
