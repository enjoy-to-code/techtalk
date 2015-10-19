// factorial (4,1)
def factorial(n: Int, accumulator: Int): Int =
  if (n == 1) accumulator else factorial(n - 1, n * accumulator)
  