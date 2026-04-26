package properties

import kotlin.properties.Delegates.observable

class Thermostat{
    var temperature : Double by observable(20.0){_, old, new ->
        if (new > 25)
            println("Warning: Temperatura is too high! {$old°C -> $new°C}")
        else
            println("Temperatura update: $old°C -> $new°C")
    }
}

fun main() {
    val thermostat = Thermostat()
    thermostat.temperature = 22.5
    //Temperatura update: 20.0°C -> 22.5°C
    
    thermostat.temperature = 27.0
    //Temperatura update: 20.0°C -> 22.5°C

}