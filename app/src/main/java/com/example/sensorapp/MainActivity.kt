package com.example.sensorapp

import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    lateinit var sensorManager: SensorManager
    lateinit var sensor: Sensor
    lateinit var sensor2: Sensor
    lateinit var sensor3: Sensor
    lateinit var textView: TextView
    lateinit var textView2: TextView
    lateinit var textView5: TextView
    lateinit var temperatureHandler: TemperatureEventHandler
    lateinit var humidityHandler: HumidityEventHandler
    lateinit var pressureHandler: PressureEventHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
        textView5 = findViewById(R.id.textView5)
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE)
        sensor2 = sensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY)
        sensor3 = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE)

        temperatureHandler = TemperatureEventHandler(textView)
        humidityHandler = HumidityEventHandler(textView2)
        pressureHandler = PressureEventHandler(textView5)

        sensorManager.registerListener(temperatureHandler, sensor, SensorManager.SENSOR_DELAY_NORMAL)
        sensorManager.registerListener(humidityHandler, sensor2, SensorManager.SENSOR_DELAY_NORMAL)
        sensorManager.registerListener(pressureHandler, sensor3, SensorManager.SENSOR_DELAY_NORMAL)

    }

}