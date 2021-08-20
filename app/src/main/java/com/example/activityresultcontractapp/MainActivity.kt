package com.example.activityresultcontractapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val payContract = registerForActivityResult(PayActivity.PayContract()) {
        println(it.toString())
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.pay).setOnClickListener {
            payContract.launch(Coffee(3, "Americano"))
        }
    }

}