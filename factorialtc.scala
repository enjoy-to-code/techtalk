def factorial(number: Int) : Int = {
   def factorialWithAccumulator(accumulator: Int, number: Int) : Int = {
       if (number == 1) 
           return accumulator
       else
           factorialWithAccumulator(accumulator * number, number - 1)
   }
   factorialWithAccumulator(1, number)
}