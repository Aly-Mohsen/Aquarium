package Aquarium

fun main(args: Array<String>){
    val symptoms: MutableList<String> = mutableListOf("white spots","red spots","not eating","bloated","belly up")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    println(symptoms.contains("red"))
    println(symptoms.contains("red spots"))

    println(symptoms.subList(4,symptoms.size))

    println(listOf(1,5,3).sum())
    println(listOf("a","b","cc").sumOf { it.length })

}