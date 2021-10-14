package com.example.laboratorio2

class nuevoV(val nombre:String, val modelo:String, val year:Int):vehiculo{

    fun ListarVehiculo(){
        println(" acabas de adquirir un vehiculo marca: $nombre, modelo: $modelo año: $year")
        Saludar()
    }

    override fun Saludar(){
        println("Gracias por adquirir su nuevo vehiculo: $nombre")
    }

    private fun conducir(){
        println("Usted ha comenzado a conducir su vehiculo $nombre")
}
}