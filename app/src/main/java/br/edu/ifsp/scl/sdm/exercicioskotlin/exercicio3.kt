package br.edu.ifsp.scl.sdm.exercicioskotlin

//ex3

fun soma(i: Int, j: Int) = i + j

fun cat(i: String, j: String): String = "${i}${j}"

fun main() {
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))

    println(xpto(2, 3, ::soma))
    println(xpto("Jo", "ão", ::cat))
}

fun foo(a: Int, b: Int, soma: (a1: Int, b1: Int) -> Int): Int {
    return soma(a,b)
}

fun bar(str1: String, str2: String,
        bar: ( String, String) -> String): String{
    return bar(str1,str2)
}

//ex 4

fun <T> xpto(a: T, b: T, xp: (a1 :T, b1:T) -> T): T {
    return xp(a,b)
}
