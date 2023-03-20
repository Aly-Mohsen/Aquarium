package aquarium

fun main(args: Array<String>){
    val symptoms: MutableList<String> = mutableListOf("white spots","red sores","not eating","bloated","belly up")

    val cures: Map<String, String> = mapOf("white spots" to "Ich", "red sores" to "hole disease")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    println(symptoms.contains("red"))
    println(symptoms.contains("red spots"))
    println(cures)
    println(symptoms.subList(4,symptoms.size))

    println(listOf(1,5,3).sum())
    println(listOf("a","b","cc").sumOf { it.length })
    println(cures["white spots"])

    println(cures.getOrDefault("bloating","sorry i do not know"))
    println(cures.getOrElse("bloating"){"No cure for this"})

    val inventory:MutableMap<String,Int> = mutableMapOf("fishnet" to 1)
    inventory.put("tank scrubber",3)
    //inventory.remove("fishnet")
    println(inventory)
}