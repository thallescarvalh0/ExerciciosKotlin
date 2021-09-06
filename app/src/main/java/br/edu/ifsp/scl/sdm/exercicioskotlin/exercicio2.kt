package br.edu.ifsp.scl.sdm.exercicioskotlin

fun main() {

    //ex 2
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai", "Pedro"),
        Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca"))


    familiaMap.forEach { "${it.key}: ${it.value}" }
}
