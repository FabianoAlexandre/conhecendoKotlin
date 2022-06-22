package Functions

    fun main(Args: Array<String>){
        getFunction()
    }
    fun getFunction(){
        val getFun:Int
         getFun = soma(12,4,::sum)
         val getFun1:Int
                 getFun1 = subt(25,20, ::sub)
            println(getFun)
            println(getFun1)
//          val getfun1 = soma1(12,4){a,b -> a+b}
   }
    fun sum(valor1:Int, valor2:Int) = valor1.plus(valor2)
    fun sub(val1:Int, val2:Int) = val1.minus(val2)

    fun soma(n1:Int, n2:Int, operation:(Int,Int)->Int):Int{
        val result = operation(n1,n2)
        return result
    }
    fun subt(n1:Int, n2:Int, operation:(Int,Int) -> Int):Int{
        val result = operation(n1,n2)
        return result
    }