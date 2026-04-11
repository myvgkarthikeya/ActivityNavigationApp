package com.example.activitynavigation

// Import required Android libraries
import android.os.Bundle        // For the onCreate lifecycle method
import android.widget.Button    // For the Button widget
import android.widget.Toast     // For showing short popup messages
import androidx.appcompat.app.AppCompatActivity // Base class for all activities
class SecondActivity : AppCompatActivity() {
    // Declare the back button
    private lateinit var btnGoBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnGoBack = findViewById(R.id.btnGoBack)
        btnGoBack.setOnClickListener {
            Toast.makeText(
                this,                               // Context
                "Going back to Main Activity!",     // Message
                Toast.LENGTH_SHORT                  // Duration
            ).show()
            finish()
        }
    }
}