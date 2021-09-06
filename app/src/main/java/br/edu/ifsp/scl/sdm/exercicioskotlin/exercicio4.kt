package br.edu.ifsp.scl.sdm.exercicioskotlin


fun soma1(i: Int, j: Int) = i + j

fun cat1(i: String, j: String): String = "${i}${j}"


fun main() {
    println(foo1(10, 20, ::soma1))
    println(bar1("Ped", "ro", ::cat1))

    println(xpto1(2, 3, ::soma))
    println(xpto1("Jo", "ão", ::cat1))
}

fun foo1(a: Int, b: Int, soma: (a1: Int, b1: Int) -> Int): Int {
    return soma(a,b)
}

fun bar1(str1: String, str2: String,
        bar: ( String, String) -> String): String{
    return bar(str1,str2)
}

//ex4
fun <T> xpto1(a: T, b: T, xp: (a1 :T, b1:T) -> T): T {
    return xp(a,b)
}
