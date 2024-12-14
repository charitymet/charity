# Mention the no. of rows and cols

# --------------------
# --- ABOUT MATRIX ---
# --------------------

m <- matrix(c(11,12,13,55,60,65,66,72,78), nrow=3, ncol=3)
m

dim(m)


# By default, elements in the matrix are filled by column.
# "byrow" attribute of the matrix() can be used to change that.
matrix(c(11,12,13,55,60,65,66,72,78), nrow=3, ncol=3, byrow=TRUE)
m


#cbind-ing and rbinding
# By using cbind() and rbind() functions
x <- c(1,2,3)
y <- c(11,12,13)
cb <- cbind(x,y)
cb

rb <- rbind(x,y)
rb


# Matrix operations/functions:
# Multiplication by a scalar
# Addition, subtraction and multiplication if two matrices.
# Transpose, determinant of a matrix, etc...
# Multiplication by a scalar

p <- 3 * m
p

n <- matrix(c(4,5,6,14,15,16,24,25,26), nrow = 3, ncol = 3)
n

# Addition of to matrices
add <- m + n
add

o <- matrix(c(10,10,10,10,10,10,10,10,10), nrow=3, ncol=3)
o

mulMat <- m %% o
mulMat

# transpose of matrix
mDash <- t(m)
mDash

s <- matrix(c(4,5,6,14,15,16,24,25,26), nrow = 3, ncol = 3, byrow=TRUE)
# Determinant of s
s_det <- det(s)
s_det
