package kh.edu.rupp.ite.mytravel.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.databinding.ActivityWelcome2Binding

class WelcomeActivity2 : AppCompatActivity() {

    private lateinit var binding : ActivityWelcome2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcome2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext2.setOnClickListener {
            buttonNext2()
        }

        binding.buttonSkip2.setOnClickListener {
            buttonSkip2()
        }
    }

    private fun buttonNext2(){
        var intent = Intent(this, WelcomeActivity::class.java)
        startActivity(intent)
    }

    private fun buttonSkip2(){
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}