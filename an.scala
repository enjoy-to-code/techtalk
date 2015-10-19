def sum(f: Int=>Int, a: Int, b: Int): Int =
	if (a == b) f(a) else f(a) + sum(f, a + 1, b)

println(sum(x=>x, 1, 10))
println(sum(x=>x*x, 1, 10))
println(sum(x=>x*x*x, 1, 10))
