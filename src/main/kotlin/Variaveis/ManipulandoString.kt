import java.util.Scanner

fun main(Args: Array<String>){
    ConcatenaStrings()
    capitalizeStrings()
    uppercaseStrings()
    lowercaseStrings()
    decapitalizeStrings()
    trimEndStrings()
    trimStartStrings()
    trimStrings()
   // replaceStrings()
    emptyorBlank()
}
fun ConcatenaStrings(){
    var firstName = "Fabiano"
    var lastName = "Alexandre"

    println(firstName      +      lastName)
    println("${firstName}, ${lastName}")
}
fun capitalizeStrings(){
    var stringTest = "este é um texte com o metodo capitalize( First letter in upperCase)"
     println("${stringTest}".capitalize())

}
fun uppercaseStrings(){
    var stringtest = "este é um teste com o metodo toUpperCase(All text in upperCase)"
    println("${stringtest}".toUpperCase())
}
fun lowercaseStrings(){
    var stringTest = "ESTE É UM TESTE COM O METODO TOLOWERCASE(All text in lowerCase)"
    println("${stringTest}".toLowerCase())
}
fun decapitalizeStrings(){
    var stringTest = "ESTE É UM TESTE COM O METODO DECAPITALIZE(first letter in lowerCase)"
    println("${stringTest}".decapitalize())
}
fun trimEndStrings(){
    var stringTest = "Este é um teste com o mertodo trimEnd( remove blanks spaces at the final text)   "
    println("${stringTest}".trimEnd())
}
fun trimStartStrings(){
    var stringTest = "   Este é um teste com o metodo trimStart( Remove blanks spaces at the inicial text)"
    println("${stringTest}".trimStart())
}
fun trimStrings(){
    var stringTest = "este é um teste com o metodo trim( Remove all blanks spaces at the text)"
    println("${stringTest}".trim())
}
//fun replaceStrings(){
//    var stringTest = "Fabiano Alexandre"
//    println("${stringTest}".replace())
//}
fun emptyorBlank(){
    val empty = ""
    println(empty.length)
    println((empty.isEmpty()))
    println(empty.isBlank())
    val blank = "        "
    println(blank.length)
    println(blank.isEmpty())
    println(blank.isBlank())
}
fun funcaoOrdemMaior(){
    val recebeFun = calculate(34, 90){a,b -> (a+b)}
    println(recebeFun)
}
fun sum(a1:Int,a2:Int) = a1.plus(a2)

fun calculate(n1:Int, n2:Int, operation:(Int,Int)->Int) = operation(n1,n2)