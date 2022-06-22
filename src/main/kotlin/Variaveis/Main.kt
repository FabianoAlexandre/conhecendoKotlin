fun main(args: Array<String>) {
    //println("Hello World!")
    //soma();
    //tipagemvariable()
    //comparacao()
    verificaValorIn()
    vereficaValorRange()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
}
fun soma(){
    var x: Int = 81
    var y: Int = 9
    println("valor da soma é = ${x.plus(y)}")   // Igual a x + y
    println("valor da soma é = ${x.minus(y)}")  // Igual a x - y
    println("valor da soma é = ${x.times(y)}")  // Igual a x * y
    println("valor da soma é = ${x.div(y)}")    // Igual a x / y
    println("valor da soma é = ${x.mod(y)}")    // Igual a x % y
}
const val EQUAL = 0
const val LESS = -1
const val MORE = 1
fun comparacao(){
    val x = 10
    val y = 22

    println(x > y)
    println(x.compareTo(y) == EQUAL)
}
fun tipagemvariable(){
    var idadeAtual = "Quarenta anos"
        idadeAtual = 40.toString() + " Em junho faço 41"

    println(idadeAtual)
}
const val MIN_AGE = 20
const val MAX_AGE = 100
fun doarSangue(){
    var age = (20..100)
   // if((age >= MIN_AGE) and (age <= MAX_AGE)){

    }
fun verificaValorIn(){
    val numbers = listOf<Int>(3,6,9,11)
    println(12 in numbers)
}
fun vereficaValorRange(){
    val number = 32
    print(number in 9..40)
}
