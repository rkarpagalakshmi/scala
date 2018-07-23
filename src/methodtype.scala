 object methodtype {
  // without arguments and without return type
  def method1(){
    println("hai how are you")
  }
  
  //with arguments without return type
  def method2(b:String){
    println(b)
  }
  //with arguments with return type 
  
  def method3(a:Int,b:Int):Int = {
    a + b
  }

    def main(d : Array[String]){
      method1()
      method2("hello scala")
      println(method3(4,5))
    }
}
