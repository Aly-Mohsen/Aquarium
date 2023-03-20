package aquarium

fun main(args:Array<String>){
    delegate()
}
fun delegate(){
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()

    val shark = Shark()
    println("Fish has color ${shark.color}")
    shark.eat()
}
interface FishAction{
    fun eat()
}
interface FishColor{
    val color:String
}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("a lot of Algae"),
    FishColor by fishColor

class Shark(fishColor: FishColor = GreyColor):
    FishAction by PrintingFishAction("Hunt & eat Fish"),
    FishColor by fishColor

object GoldColor:FishColor{
    override val color="gold"
}
object RedColor:FishColor{
    override val color="red"
}
object GreyColor:FishColor{
    override val color="grey"
}
object GreenColor:FishColor{
    override val color="Green"
}
object BlueColor:FishColor{
    override val color="blue"
}
class PrintingFishAction(private val food: String):FishAction{
    override fun eat() {
        println(food)
    }
}
