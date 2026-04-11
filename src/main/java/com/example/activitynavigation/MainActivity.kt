package com.example.activitynavigation

// Import required Android libraries
import android.content.Intent   // For creating and launching Intents
import android.os.Bundle        // For the onCreate lifecycle method
import android.widget.Button    // For the Button widget
import android.widget.Toast     // For showing short popup messages

import androidx.appcompat.app.AppCompatActivity // Base class for all activities
class MainActivity : AppCompatActivity() {

    private lateinit var btnGoToSecond: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btnGoToSecond = findViewById(R.id.btnGoToSecond)

        btnGoToSecond.setOnClickListener {

            Toast.makeText(
                this,                          // Context (current activity)
                "Opening Second Activity!",    // Message to display
                Toast.LENGTH_SHORT             // Duration: short popup
            ).show()

            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)
        }
    }
}