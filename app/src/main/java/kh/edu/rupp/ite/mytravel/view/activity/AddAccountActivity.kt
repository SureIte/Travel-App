package kh.edu.rupp.ite.mytravel.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.databinding.ActivityAddAccountBinding

class AddAccountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            buttonLogin()
        }
        binding.ButtonCreateAccount.setOnClickListener {
            buttonCreateAccount() }

    }

    private fun buttonLogin() {
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    private fun buttonCreateAccount() {
        var intent = Intent(this, CreateAccountActivity::class.java)
        startActivity(intent)
    }
}