package kh.edu.rupp.ite.mytravel.view.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R

class ActivityHome : AppCompatActivity() {

    @SuppressLint("WrongViewCast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize and set up your UI components and logic here

        // Example: Retrieving a TextView from the layout and updating its text
        val textView = findViewById<TextView>(R.id.buttonInFragment)
        textView.text = "Welcome to the Home Activity!"

        // Example: Setting an OnClickListener for a button
        val button = findViewById<Button>(R.id.button_home)
        button.setOnClickListener {
            // Perform some action when the button is clicked
            Toast.makeText(this@ActivityHome, "Button clicked!", Toast.LENGTH_SHORT).show()
        }
    }

    // Add any additional methods or callbacks as needed

}
