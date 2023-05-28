package com.ainosi.coba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvText: TextView
    lateinit var tvTextTry: TextView
    var valueText = ""
    val valueText2: String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tv_text)
        tvTextTry = findViewById(R.id.tv_text_try)
        tvText.text = "Hallo world"
    }

    override fun onStart() {
        super.onStart()
//        tvText.text = "Hallo bro"
        valueText = tvText.text.toString()
        tvTextTry.text = valueText
    }

    override fun onResume() {
        super.onResume()
//        tvText.text = "Hallo bang"
    }

    override fun onPause() {
        super.onPause()
        tvText.text = "Pause Bang"
    }

    override fun onStop() {
        super.onStop()
        tvText.text = "Stop Bang"
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}