
import java.util.Scanner

fun main(Args: Array<String>){
    var reader = Scanner(System.`in`)

    println("Digite a nota 1")
    var nota1 = reader.nextDouble()
    println("Digite a nota 2")
    var nota2 = reader.nextDouble()

    var peso1 = 3.5
    var peso2 = 7.5

    var mediaTotal = ((peso1 * nota1 + peso2 * nota2)) / (nota1.plus(nota2))
    var format = "%.5f".format(mediaTotal)

    println("Media = ${format}")

}