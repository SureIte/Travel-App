package kh.edu.rupp.ite.mytravel.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.databinding.ActivityWelcome1Binding

class WelcomeActivity1 : AppCompatActivity() {


    private lateinit var binding: ActivityWelcome1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcome1Binding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.buttonNext1.setOnClickListener {
           buttonNext1()
       }

        binding.buttonSkip1.setOnClickListener {
            buttonSkip1()}
    }
    private fun buttonNext1(){
        var intent = Intent(this, WelcomeActivity2::class.java)
        startActivity(intent)
    }

    private fun buttonSkip1(){
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}

