# -------------------------------------
# Adding rows and cols to the dataframe
# -------------------------------------

# Creating a dataframe representing products in a store
Products <- data.frame(
  Product_ID = c(101, 102, 103),
  Product_Name = c("T-Shirt", "Jeans", "Shoes"),
  Price = c(15.99, 29.99, 49.99),
  Stock = c(50, 30, 25)
)

# Print the existing dataframe
cat("Existing dataframe (Products): \n")
print(Products)

# Adding a new row for a new product
New_Product <- c(104, "Sunglasses", 39.99, 40)
Products <- rbind(Products, New_Product)

# Print the updated dataframe after adding the new product
cat("\nUpdated dataframe after adding the new product:\n")
print(Products)

# Adding a new column for 'Discount' to the dataframe
Discount <- c(5, 10, 8, 15) # New col vals for discount
Products <- cbind(Products, Discount)
# Rename the added col
colnames(Products)[ncol(Products)] <- "Discount"
# Renaming the last column

# Print the updated dataframe after adding the new col
cat("\nUpdated dataframe after adding the new col 'Discount': \n")
print(Products)

