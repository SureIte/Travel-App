package kh.edu.rupp.ite.mytravel.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R

class WelcomeActivity : AppCompatActivity() {

    private lateinit var getStartedButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome2)

        getStartedButton = findViewById(R.id.getStartedButton)

        getStartedButton.setOnClickListener {
            // Define the action to perform when the "Get Started" button is clicked

            // Option 1: Navigate to another activity
            startActivity(Intent(this, MainActivity::class.java))

            // Option 2: Perform other actions, such as enabling features, setting user preferences, etc.

            // Close the WelcomeActivity to prevent the user from going back to it
            finish()
        }
    }
}
