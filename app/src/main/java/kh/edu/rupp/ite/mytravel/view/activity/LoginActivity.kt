package kh.edu.rupp.ite.mytravel.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Assuming you have a button for login
        loginButton().setOnClickListener {
            // Perform your login logic here

            // If login is successful, navigate to WelcomeActivity
            if (isLoginSuccessful()) {
                val intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
                finish() // Optional: Close LoginActivity to prevent going back on pressing back button
            }
        }
        binding.loginButton.setOnClickListener {
            loginButton()
        }

    }


    private fun loginButton() {
        var intent = Intent(this, WelcomeActivity::class.java)
        startActivity(intent)
    }

    // Replace this with your actual login logic
    private fun isLoginSuccessful(): Boolean {
        // Perform authentication logic here
        // Return true if login is successful, false otherwise
        return true
    }
}

private fun Any.setOnClickListener(function: () -> Unit) {

}





