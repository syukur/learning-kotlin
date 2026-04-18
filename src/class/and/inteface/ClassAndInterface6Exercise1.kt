package `class`.and.inteface

abstract class SmartDevice(val name: String) {
    abstract fun turnOn()
    abstract fun turnOff()
}

class SmartLight(name: String) : SmartDevice(name){
    override fun turnOn() {
        println("$name Turning ON.")
    }

    override fun turnOff() {
        println("$name Turning OFF.")
    }

    fun adjustBrightness(level: Int){
        println("Adjusting $name brightness to $level")
    }
}

class SmartTermostat(name: String): SmartDevice(name){
    override fun turnOn() {
        println("$name Turning HEATING.")
    }

    override fun turnOff() {
        println("$name Turning OFF.")
    }

    fun adjustTemperature(level: Int){
        println("Adjusting $name temperature to $level")
    }
}

fun main() {
    val livingRoomLigth = SmartLight("Living Room Light")
    val bedroomTermostat = SmartTermostat("Bedroom Termostat")

    livingRoomLigth.turnOff()
    livingRoomLigth.adjustBrightness(level = 10)
    livingRoomLigth.turnOff()

    bedroomTermostat.turnOn()
    bedroomTermostat.adjustTemperature(level = 5)
    bedroomTermostat.turnOn()
}