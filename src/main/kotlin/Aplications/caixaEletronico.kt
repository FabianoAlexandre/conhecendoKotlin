package Aplications

import java.util.Scanner

val reader = Scanner(System.`in`)
val option = reader.nextInt()

fun main(args: Array<String>){

    menuOptions()
}
fun menuOptions(){
    println("Escolha uma opção !! \n 1 - Carregar Notas \n 2 - Retirar Notas \n 3 - Estatistica \n 9 - Fim")
    when (option) {
        1 -> carregarNotas()
        2 -> retirarNotas()
        3 -> estatistica()
        9 -> fim()
        else -> {
            println("opção invalida!")
        }
    }
}
fun carregarNotas(){
    //var notas = IntArray(8)
    //var totalNotas = IntArray(8)
    var nora2 = reader.nextInt()
    var nota5 = reader.nextInt()
    var nota10 = reader.nextInt()
    var nota20 = reader.nextInt()
    var nota50 = reader.nextInt()
    var nota100 = reader.nextInt()
    var nota200 = reader.nextInt()
    var totalNota2 = 0
    var totalNota5 = 0
    var totalNota10 = 0
    var totalNota20 = 0
    var totalNota50 = 0
    var totalNota100 = 0
    var totalNota200 = 0
    var flag = true

    println("Carregando notas no caixa!")
    while (flag){
        println("Escolha uma opção de carregamento por vez! \n Carregar Nota: \n2\n5\n10\n20\n50\n100\n200")
        when(option){
            2 -> {
                println("O maxímo de notas de 2 permitidas no caixa é de 100 notas")
                println("Informe a quantidade de notas que deseja carregar")
                var nota2 = reader.nextInt()
                totalNota2 += nota2
                println(totalNota2)
            }

        }
    }
    println("1: teste carrega Notas!")
}
fun retirarNotas(){
    println("2: teste retira notas")
}
fun estatistica(){
    println("3: teste estatistica")
}
fun fim(){
    println("9: sai do programa")
}