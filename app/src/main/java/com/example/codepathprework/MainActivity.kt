package com.example.codepathprework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // inflates activity_main
        val button = findViewById<Button>(R.id.helloButton)
        // this is a method where the only parameter is a lambda function
        // this allows us to omit () entirely and use {} instead
        button.setOnClickListener {
            Log.v("Hello World!", "button clicked!") // good for debugging
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }
    }
}