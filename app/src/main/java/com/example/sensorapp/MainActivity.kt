package com.example.sensorapp

import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    lateinit var sensorManager: SensorManager
    lateinit var sensor: Sensor
    lateinit var textView: TextView
    lateinit var temperatureHandler: TemperatureEventHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE)

        temperatureHandler = TemperatureEventHandler(textView)

        sensorManager.registerListener(temperatureHandler, sensor, SensorManager.SENSOR_DELAY_NORMAL)

    }

}