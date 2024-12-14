# -----------------
# --- Dataframe ---
# -----------------
# to store data in tabular format
# can store heterogeneous data

# Creating a dataframe
friend.data <- data.frame(
  friend_id = c(1:5),
  friend_name = c("Monica", "Chandler", "Ross", "Rachel", "Joey"),
  stringsAsFactors = FALSE
)

# Print the dataframe
print(friend.data)

# R program to get the structure of the dataframe
# using str()
print(str(friend.data))


# R program to get the summary of the dataframe
# using summary()
print(summary(friend.data))


# R program to extract the data from the dataframe
# Extracting friend_name column
result <- data.frame((friend.data $ friend_name))
print(result)


# R program to expand the dataframe
# Expanding the dataframe
friend.data $ location <- c("Kolkata", "New Delhi", "Banglore", "Hyderabad", "Chennai")
resultant <- friend.data

# print the modified dataframe
print(resultant)


# Access Items using [colNo]
friend.data[1]

# Access Items using [['colName']]
friend.data[['friend_name']]

# Access Items using $
friend.data $ friend_id

# find out the no. of rows and cols
dim(friend.data)
