def sum(n: Int): Int =
	if (n == 0) 0 else n + sum(n - 1)