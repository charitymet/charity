# 
# Read and Write Library
# 

install.packages("xlsx")
library(xlsx)
install.packages("readxl")
library(readxl)
install.packages("writexl")
library(writexl)

#setwd("D:/FY_MCA_1528/MCA1528_ADBMS/RStudio_1528/30-11-2024/mydata.csv")

# Reading and writing data from csv
dataT <- read.table("D:/FY_MCA_1528/MCA1528_ADBMS/RStudio_1528/30-11-2024/customers-100.csv", sep=",", header=T)
dataT

# dimension
dim(dataT)

# Load just a few lines at the Top or Bottom
head(dataT, 2)
tail(dataT, 2)

# Following is called Subsetting
# It will print rows from 1 to 2 and all cols
dataY <- dataX[1:2,]
dataY

z <- data.frame(a=5, b=10, c=pi)
write.csv(z,file="data.csv")