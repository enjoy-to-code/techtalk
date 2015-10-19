def sum(n: Int, acc: Int):Int =
	if(n == 0) acc else sum(n - 1, acc + n)
