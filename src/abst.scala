
//abstract class:
abstract class abst {
  def add()
  def muti(){
    var a:Int = 10
    var b:Int = 20 
    println(a * b)
  }
}
//class is using abstract method by using 'extends' ,here we need to define all the methods which are not implemented 
//in the abstract class
class sample extends abst {
def add ()
{
  println (10 + 20)
}
}

object abstrcat1{
def main (d : Array[String]){
val sample1  =  new sample()
sample1.add()
sample1.muti()
}
}
