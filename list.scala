val a = List(1,2,3,4,5,6,7)

val b = a.map(x => x * x)
val c = a.filter(x => x < 5)
val d = a.reduce((x, y)=>x+y)

println(b)
println(c)
println(d)
