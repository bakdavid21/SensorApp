package com.example.sensorapp

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.widget.TextView

class TemperatureEventHandler(val textView: TextView): SensorEventListener {
    override fun onSensorChanged(p0: SensorEvent?) {
        textView.text = "${p0!!.values[0]}"
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }

}