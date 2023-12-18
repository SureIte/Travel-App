package kh.edu.rupp.ite.mytravel.view.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R
import kh.edu.rupp.ite.mytravel.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        binding.getStartedButton.setOnClickListener {
            getStartButton()
        }
    }
    private fun shouldBeDisplayed(): Boolean {
        // Implement your logic here to decide whether the welcome screen should be displayed.
        // For example, you can use SharedPreferences, a database, or a flag to check if it's the first launch.
        // Return true if it should be displayed, false otherwise.
        return true
    }
    private fun getStartButton(){
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

