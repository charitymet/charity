# empList = list(empId, empName, numberOfEmp)
# print(empList)

# -------------------
# --- ABOUT LISTS ---
# -------------------
myList <- list(name="Charity", age=22, city="Mumbai")
print(myList)


empId = c(1,2,3,4)
empName = c("xyz", "abc", "pqr", "lmn")
numberofEmp = 4
empList = list("ID"=empId, "Name"=empName, "Total Emp"=numberofEmp)

print(empList)
print(empList$Name) # - accessing all th empNames in the list

print(empList$Name[2]) # - for accessing a specific element

print(empList[3][1]) # third col, 1st index pos



empList $ 'TotalEmp' = 5
empList[[1]][5] = 5
empList[[2]][5] = "Crystal"

print(empList)
print(empList[[2]][1])


# - replacing the element
empList[[2]][1] = "Charity" 
print(empList $ Name)

# ----------------------------------------------

# Combining 2 Lists
list1 <- list(2,4,6,8,10)
list2 <- list(1,3,5,7,9)

combined <- c(list1, list2)
print(combined)

