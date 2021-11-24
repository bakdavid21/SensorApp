package com.example.sensorapp

import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var sensorManager: SensorManager
    lateinit var sensor: Sensor
    lateinit var textView: TextView
    lateinit var imageView: ImageView
    lateinit var temperatureHandler: TemperatureEventHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
    }

    fun buttonHandler(view: View){

    }
}