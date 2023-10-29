package kh.edu.rupp.ite.mytravel.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R

import android.view.View


class WelcomeActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Check if the user should see the welcome screen or proceed to the main activity
        if (shouldBeDisplayed()) {
            setContentView(R.layout.activity_welcome)

            val getStartedButton = findViewById<View>(R.id.getStartedButton)
            getStartedButton.setOnClickListener {
                // Handle button click, e.g., navigate to the main activity
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        } else {
            // Skip the welcome screen and proceed to the main activity
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun shouldBeDisplayed(): Boolean {
        // Implement your logic here to decide whether the welcome screen should be displayed.
        // For example, you can use SharedPreferences, a database, or a flag to check if it's the first launch.
        // Return true if it should be displayed, false otherwise.
        return true
    }
}

