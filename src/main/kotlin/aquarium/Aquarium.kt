package aquarium

import kotlin.math.PI

open class Aquarium(var length: Int = 100,var width: Int = 20, var height: Int = 40){
    open var volume:Int
        get() = width * length * height / 1000        //gets value for volume
        set(value) {height=(value * 1000) / width * length}
    open var water :Double= volume * 0.9

    constructor(numberOfFish: Int):this(){
        val water :Int = numberOfFish * 2000 //cm3
        val tank :Double = water + (water * 0.1)
        height = (tank/(length * width)).toInt()
    }
}
class towerTank():Aquarium(){

    override var volume:Int
        get() = (width * length * height / 1000 * PI).toInt()
        set(value) {height=(value * 1000)/width * length}
    override var water = volume * 0.8
}
