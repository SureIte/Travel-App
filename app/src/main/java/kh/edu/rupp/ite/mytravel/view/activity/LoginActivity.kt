package kh.edu.rupp.ite.mytravel.view.activity

import android.os.Bundle

import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R

class LoginActivity : AppCompatActivity() {
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Find the "Login" button by its ID
        loginButton = findViewById(R.id.loginButton)

        // Set a click listener for the button
        loginButton.setOnClickListener {
            // Handle the button click event here
            Toast.makeText(this, "Login button clicked!", Toast.LENGTH_SHORT).show()
        }
    }

}
