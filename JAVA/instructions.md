# Setting Up Spring Project with JSTL, Postgres, and Spring Libraries

---

## 1. Required Libraries

### Download Links:
- **Spring Library**: [Download Spring Library](https://drive.google.com/file/d/1ktsDm4Apo7yac40yAyEm2bUGppUxagOl/view?usp=sharing)
- **Postgres Library**: [Download Postgres Library](https://github.com/charitymet/charity/tree/main/JAVA/postgres)
- **JSTL Library**: [Download JSTL Library](https://github.com/charitymet/charity/tree/main/JAVA/jstl)

### Instructions:
Download the jar files from the above links and extract them (if needed).

---

## 2. Adding Libraries to Your Build Path

### Step 1: Create a User Library in Eclipse

1. **Open Eclipse Preferences:**
   - Navigate to `Window > Preferences`.

2. **Navigate to User Libraries:**
   - In the Preferences window, go to `Java > Build Path > User Libraries`.

3. **Create a New Library:**
   - Click on the `New` button and give the library a name (e.g., `JSTL`, `Postgres`, or `Spring`).

4. **Add JAR Files:**
   - Click on `Add External JARs` and select the respective jar files downloaded for each library.

5. **Save the Library:**
   - Click `Apply and Close` to save your changes.

### Repeat the Above Steps for Each Library:
- Add JSTL library jars (`javax.servlet.jsp.jstl-api.jar` and `javax.servlet.jsp.jstl.jar`).
- Add Postgres library jar files.
- For Spring, extract the downloaded folder and select all jar files within it.

---

## 3. Running the Project

### To Run:
1. **Right-Click on the Project Root:**
   - Select `Run As > Server` or `Run As > Java Application`.

---

## 4. Creating a New Class

### Step 1: Create a New Class
1. **Navigate to the Project Root:**
   - Right-click on the project folder.

2. **Select `New > Class`:**
   - From the context menu, choose `New` and then `Class`.

3. **Enter Details:**
   - Provide the package and class name, then click `Finish`.

![Create Class Screenshot](https://github.com/user-attachments/assets/664536a5-53e0-487b-a87d-5df6815231dd)

---

## 5. Creating `AppCtx.xml`

### Step 1: Create a New XML File
1. **Right-Click on the Project Root:**
   - Select `New > Other`.

2. **Search for XML:**
   - In the dialog box, search for `XML File` and select it.

3. **Name the File:**
   - Enter the name `AppCtx.xml` and click `Finish`.

4. **Edit the XML:**
   - Open the file and add the necessary Spring configuration.

![Create XML File Screenshot](https://github.com/user-attachments/assets/419a4b89-99d0-449b-a1ff-1bbd4100b843)

---

By following these steps, you will set up a Spring project in Eclipse, including the necessary libraries for Spring, Postgres, and JSTL.

