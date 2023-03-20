package aquarium.generics

open class WaterSupply(var needsProcessed:Boolean)

class TapWater:WaterSupply(true){
    fun addChemicalCleaners(){
        needsProcessed = false
    }
}
class FishStoreWater:WaterSupply(false)
class LakeWater:WaterSupply(true){
    fun filter(){
        needsProcessed = false
    }
}
class Aquarium<out T: WaterSupply> (val waterSupply: T){
    fun addWater(cleaner: Cleaner<T>){
        if(waterSupply.needsProcessed){
            cleaner.clean(waterSupply)
            println("${waterSupply::class.simpleName} has been cleaned via chemicals")
        }
        println("adding water from ${waterSupply::class.simpleName}")
    }
}
interface Cleaner<in T:WaterSupply>{
    fun clean(waterSupply: T)
}
class TapWaterCleaner: Cleaner<TapWater>{
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}
fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")
fun genericExample(){
    val cleaner = TapWaterCleaner()
    val aquariumTap = Aquarium(TapWater())
    aquariumTap.addWater(cleaner)
    addItemTo(aquariumTap)
}
fun <T:WaterSupply> isWaterClean(aquarium: Aquarium<T>){
    println("aquarium water is clean:${aquarium.waterSupply.needsProcessed}")
}
inline fun <reified R:WaterSupply>Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R
inline fun <reified T: WaterSupply> WaterSupply.isOfType()=this is T
fun main(){
    genericExample()
    val aquarium = Aquarium(FishStoreWater())
    isWaterClean(aquarium)
    println("is type of water supply Tap Water?\nAnswer:"+aquarium.hasWaterSupplyOfType<TapWater>())
    println("is type of water supply Lake Water?\nAnswer:"+aquarium.hasWaterSupplyOfType<LakeWater>())
    println("is type of water supply Fish Store Water?\nAnswer:"+aquarium.hasWaterSupplyOfType<FishStoreWater>())
    println(aquarium.waterSupply.isOfType<TapWater>())
    println(aquarium.waterSupply.isOfType<LakeWater>())
    println(aquarium.waterSupply.isOfType<FishStoreWater>())

}