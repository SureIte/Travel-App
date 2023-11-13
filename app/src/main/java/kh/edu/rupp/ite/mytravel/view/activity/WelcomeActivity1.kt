package kh.edu.rupp.ite.mytravel.view.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R

class WelcomeActivity1 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome1)

        val buttonGetStart = findViewById<View>(R.id.buttonGetStart)

        buttonGetStart.setOnClickListener {
            // Define the action to perform when the screen is clicked
            // For example, you can navigate to the main activity or perform other actions​
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}

