# --------------
# --- Factor ---
# --------------

# Creating a method
x <- c("female","male","male","female")
print(x)


# Converting the vector x into a factor
gender <- factor(x)
print(gender)


# Creating a factor with levels defined by programmer
gender <- factor(c("female","male","male","female"),
                 levels = c("female","transgender","male"));
gender


# Checking for a factor in R
gender <- factor(c("female","male","male","female"));
print(is.factor(gender))


# Accessing elements of a factor in R
gender <- factor(c("female","male","male","female"));
gender[3]


# More than one element can be accessed at a time
gender <- factor(c("female","male","male","female"))
gender[c(2,4)]


# Subtract one element at a time
gender <- factor(c("female","male","male","female"));
gender[-3]


# modification of a factor in R
gender <- factor(c("female","male","male","female"));
gender[2] <- "female"
gender





