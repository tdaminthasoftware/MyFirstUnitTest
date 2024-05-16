package com.example.myfirstunittest

class Engine(
    val cc: Int, val horsePower:Int, var temperature: Int,
    var isTurnedOn: Boolean
) {
    fun turnOn(){
        isTurnedOn = true
        temperature = 95
    }

    fun turnOff(){
        isTurnedOn = false
        temperature = 50
    }

    fun resetEngineMeter(){
        println("reset success")
    }
}