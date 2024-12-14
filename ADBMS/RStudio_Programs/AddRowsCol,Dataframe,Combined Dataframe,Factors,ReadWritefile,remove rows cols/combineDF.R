# -------------------------
# Combining Dataframes in R
# -------------------------

# Creating two sample dataframes
df1 <- data.frame(
  Name = c("Mike", "Phoebe"),
  Age = c(30, 25),
  Score = c(80,85)
)

df2 <- data.frame(
  Name = c("Dean", "Cassie"),
  Age = c(28, 35),
  Score = c(90,75)
)


# Printing the existing dataframes
cat("Dataframe 1 : \n")
print(df1)
cat("Dataframe 2 : \n")
print(df2)


# Combining the dataframes horizontally using rbind()
combined_df_r = rbind(df1, df2)
cat("\nCombined dataframe (rbind) : \n")
print(combined_df_r)

# Combining the dataframes vertically using rbind()
combined_df_c = cbind(df1, df2)
cat("\nCombined dataframe (cbind) : \n")
print(combined_df_c)

