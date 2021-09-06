package br.edu.ifsp.scl.sdm.exercicioskotlin

fun main() {
    // ex 1
    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desevolvimento de Sistemas")

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    for ((index, value) in listaCursos.withIndex()) {
        if ("Sistemas" in listaCursos[index]){
            println(" $index - $value")}
    }
}
