package com.example.sensorapp

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.widget.TextView
import kotlin.math.roundToInt

class HumidityEventHandler(val textView2: TextView): SensorEventListener {

    override fun onSensorChanged(p0: SensorEvent?) {
        textView2.text = "${p0!!.values[0].roundToInt()} %"
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }
}