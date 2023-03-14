package Aquarium
class Fish(val friendly:Boolean = true,volumeNeeded :Int) {
    val size : Int

    init {
        println("First init block")
    }

    constructor():this(true,9){
        println("running secondary constructor")
    }

    init {
        if(friendly){
            size = volumeNeeded
        }
        else{
            size = volumeNeeded * 2
        }
    }

    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("Last init block")
    }
}

fun fishExample(){
    val fish = Fish(false,20)
    println("Is this fish friendly? ${fish.friendly}.\nit needs a volume of ${fish.size}")
}
