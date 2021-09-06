package br.edu.ifsp.scl.sdm.exercicioskotlin

// Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int{
    return f(i)
}

fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int{
    return f(i, j)
}

// Funções
fun somar(i: Int, j: Int): Int{
    return i + j
}

fun multiplicar(i: Int, j: Int): Int{
    return i * j
}

fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}

// Main
fun main() {
    // 1. Chamadas do primeiro passo

    var v1 = 1;
    var v2 = 6;

    println("soma : ${processaInteiros(v1,v2, ::somar)}")
    println("multiplica : ${processaInteiros(v1,v2, ::multiplicar)}")
    println("raiz quadrada : ${processaInteiro(v1, ::raizQuadrada)}")

    // 2. Chamadas do segundo passo

    println("soma lambda : ${processaInteiros(v1,v2) {a1:Int, b1:Int -> somar(a1,b1)}} ")
    println("multiplica lambda: ${processaInteiros(v1,v2) { a1:Int, b1:Int -> multiplicar(a1,b1)}}")
    println("raiz quadrada lambda: ${processaInteiro(v1) { a1: Int -> raizQuadrada(a1)}}")

}