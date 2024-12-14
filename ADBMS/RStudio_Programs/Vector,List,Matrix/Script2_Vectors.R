# -----------------------
# ---- ABOUT VECTORS ----
# -----------------------

# multiple values of the same type
# vector is dynamic in nature, always of double type
# Array is of a fixed size

# VECTOR CREATION
# Concatenation function
x <- c(61,4,21,67,89,2)
cat('Vector using c function', '\n', x)


y <- seq(1,10,length.out=5)
cat('Vector using seq function', '\n', y)


z <- 2:7
cat('Vector using: ', '\n', z)

# --------------------------------------------------

x <- c(1,2,3,4,5)
length(x)
typeof(x)

y <- c('apple', 'banana', 'cherry')
length(y)
typeof(y)

z <- c(TRUE, FALSE, TRUE, TRUE)
length(z)
typeof(z)

# --------------------------------------------------

cat('using subscript operator', '\n' ,x[2])


y <- c(4,8,10,20,15,3,45)
cat('using combine() function: ', y[c(1,4)])

y[4] <- 90
y


y <- NULL
y


# Sorting the method
x <- c(4,8,10,20,15,3,45)
p <- sort(x)
print(p)

d <- sort(x, decreasing = TRUE)
print(d)
