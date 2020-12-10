package com.adevperu.template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun ui() {
        findViewById<TextView>(R.id.textView).setOnClickListener {
            showMessage(MESSAGE)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ui()
    }

    companion object {
        const val MESSAGE = "Hello Kotlin by Android Dev Perú !"
    }
}