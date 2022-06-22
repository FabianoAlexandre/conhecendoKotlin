package Variaveis

fun main(args:Array<String>){
    valorDireto()
    valorIndireto()
}
fun valorDireto(){
    var peso = 75;
    println(peso)
}
fun valorIndireto(){
    var peso: Int
    peso = 74
    println(peso)
}
fun valorindiretoCondicional(){
    var peso: Int
    peso = 80
    if(peso == 80){
        println("${peso} : peso meio pesado")
    }else if(peso == 70){
        println("${peso}: peso leve")
    }
}