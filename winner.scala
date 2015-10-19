case class Player(name: String, score: Int) 

def declareWinner(p: Player) =
	println(p.name + " is the winner!! ")

def maxScore(p1: Player, p2: Player) = 	if (p1.score > p2.score) p1 else p2

def winner(p1: Player, p2: Player) = 	declareWinner(maxScore(p1, p2))



val players = List(Player("Ram", 10), Player("John", 15), Player("Hari", 20), Player("Krishna", 17))
println(players.reduceLeft(maxScore))
