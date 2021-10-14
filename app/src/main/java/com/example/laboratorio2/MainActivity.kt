package com.example.laboratorio2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun lab2(){

        val carro1 = nuevoV("Honda", "Civic", 2021)
        carro1.ListarVehiculo()

        val carro2 = nuevoV("Nissan", "Versa", 2018)
        carro2.ListarVehiculo()

        val carro3 = nuevoV("Kia", "Rio", 2019)
        carro3.ListarVehiculo()
    }
}