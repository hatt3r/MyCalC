package com.cessabit.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var tvInput: TextView? = null
    var lastNumber:Boolean = false
    var lastDot: Boolean =false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvInput = findViewById(R.id.tvInput)
    }
    fun onDigit(view:View)
    {
        tvInput?.append((view as Button).text)
        lastNumber = true
        lastDot = false
    }
    fun onClear(view:View)
    {
        tvInput?.text = ""
    }
    fun onDecimalPoint(view: View)
    {
        if(lastNumber && !lastDot)
        {
            tvInput?.append(".")
            lastNumber = false
            lastDot = true
        }

    }
}