package com.example.sensorapp

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.widget.TextView
import kotlin.math.roundToInt

class PressureEventHandler(val textView5: TextView): SensorEventListener {
    override fun onSensorChanged(p0: SensorEvent?) {
        textView5.text = "${p0!!.values[0].roundToInt()} hPa"
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }
}