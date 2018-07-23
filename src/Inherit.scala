
//This is inheritance 
class Inherit {
  def method1(){
  println("version a")  
    }
}

class Inherita extends Inherit {
  def method2(){
    println("version b")
  }
}

class Inheritb extends  Inherita {
  def method3(){
    println("version c")
  }
}
object Inheri{
  def main (a : Array[String]){
    val Inh =  new Inheritb
    Inh.method3()
    Inh.method1()
    Inh.method2()
    
  }
}