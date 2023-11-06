package kh.edu.rupp.ite.mytravel.view.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R

class MainActivity : AppCompatActivity() {

     @SuppressLint("MissingInflatedId")
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         // Example: Start WelcomeActivity on clicking start button
         var getStartedButton = findViewById<View>(R.id.getStartedButton)
         getStartedButton.setOnClickListener{
             val intent = Intent(this,CreateAccountActivity::class.java)
             startActivity(intent)
         }

         // Example: Start WelcomeActivity on clicking start button welcome1
         var buttonGetStart = findViewById<View>(R.id.buttonGetStart)
         buttonGetStart.setOnClickListener{
             var intent = Intent(this,CreateAccountActivity::class.java)
             startActivity(intent)
         }

        // Example: Start LoginActivity on clicking login button
        val loginButton = findViewById<View>(R.id.loginButton)
        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // Example: Start CreateAccountActivity on clicking create account button
        val createAccountButton = findViewById<View>(R.id.createAccountButton)
        createAccountButton.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }

         // Example: Start


    }
}
