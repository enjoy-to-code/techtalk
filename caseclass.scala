abstract class Expr
case class Num(n: Int) extends Expr
case class Sum(l: Expr, r: Expr) extends Expr
case class Prod(l: Expr, r: Expr) extends Expr

def evalExpr(e: Expr): Int = e match {
  case Num(n) => n
  case Sum(l, r) => evalExpr(l) + evalExpr(r)
  case Prod(l, r) => evalExpr(l) * evalExpr(r)
}

def printExpr(e: Expr) : Unit = e match {
  case Num(n) => print(" " + n + " ")
  case Sum(l, r) => printExpr(l); print("+"); printExpr(r)
  case Prod(l, r) => printExpr(l); print("x"); printExpr(r)
}


var expr1 = new Sum(new Num(1), new Prod(new Num(2), new Num(3)))
var expr2 = new Prod(new Num(3), new Num(4))
evalExpr(expr1)
evalExpr(expr2)
printExpr(expr1)
printExpr(expr2)
