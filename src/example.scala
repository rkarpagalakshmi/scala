

class abc{
  //explicit function:the return type is known (ERT -> EXplicit return type)
  val add:(Int , Int) => Int = (a , b) =>  a + b
  //Implicit function:the return type is unknown (IRT -> EXplicit return type)
  val iseven = (a : Int) => {
    if (a/2 == 0) {
      println(" yes the number is even")
    } else
    {
      println ("no the number is not even")
     }
    }
  //different methods defining the higher order function using val and def. In def also two methods
  def math(i: Int, j : Int, k : (Int , Int) => Int) : Int = k(i,j)
  val deq = (l : Int, x2 :Int, k1:(Int,Int)=>Int) => k1(l,x2)
  def math1(i: Int, j : Int, k : (Int , Int) => Int) : Int = k(i,j)
   def apply1(a:Int,b:Int):Int = {
    a + b
  }
def sum(i:Int => Int,v:Int) = i(v)
  def apply(a:Int):Int = {
    a + 20
  }
}


object example {
 def main(d : Array[String]){
 val das = new abc
 val v = das.add(30,50)
 println ("the sum of output is " + v)
 das.iseven(45)
 val des = das.math(50,20,(i,j) => i * j)
 println(des)
 println(das.sum(das.apply , 30))
 println(das.math1(40, 50, das.apply1))
 println(das.deq(40,98,das.apply1))
 }
}