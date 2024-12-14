# --------------------
# Remove rows and cols
# --------------------

# install.packages("dplyr") OR Tools > Install Packages
library(dplyr)

# Create a dataframe
data <- data.frame(
  friend_id = c(1, 2, 3, 4, 5),
  friend_name = c("Monica", "Chandler", "Ross", "Rachel", "Joey"),
  location = c("Kolkata", "New Delhi", "Banglore", "Hyderabad", "Chennai")
)
data


# Remove a row with friend_id = 3
data <- subset(data, friend_id != 3)
data

# Remove the location column
data <- select(data, -location)
data
