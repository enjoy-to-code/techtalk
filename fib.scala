def fib(n:Int): Long =  {
    require(n >=0 , "Input cannot be negative")
    n match {
        case 0 => 0
        case 1 => 1
        case n => fib(n-1) + fib(n-2)
    }
}