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

        binding.loginButton.setOnClickListener {
            loginButton()
        }

        binding.textViewForgot.setOnClickListener { textviewForgot() }
    }
    private fun loginButton() {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
   }

    private fun textviewForgot(){
        var intent = Intent(this, ForgetPasswordActivity::class.java)
        startActivity(intent)
    }

}




