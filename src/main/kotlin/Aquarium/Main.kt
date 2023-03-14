package Aquarium

fun main(args: Array<String>) {
    println("Hello World!")
    buildAquarium()
}
fun printAquarium(myAquarium: Aquarium){
    println("length: ${myAquarium.length} cm\nwidth: ${myAquarium.width} cm\nheight: ${myAquarium.height} cm\nvolume: ${myAquarium.volume} litres")
    println("________________________________________________________________________________________________")
}
private fun buildAquarium(){
    val myAquarium = Aquarium()
    println("Aquarium Name: myAquarium")
    printAquarium(myAquarium)

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Aquarium Name: smallAquarium")
    printAquarium(smallAquarium)

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Aquarium Name: myAquarium2")
    printAquarium(myAquarium2)

    makeFish()
    //fishExample()
}
fun makeFish(){
    val shark =Shark()
    val pleco = Plecostomus()
    println("Shark:${shark.color}\nPlecostomus:${pleco.color}")
    shark.eat()
    pleco.eat()
}