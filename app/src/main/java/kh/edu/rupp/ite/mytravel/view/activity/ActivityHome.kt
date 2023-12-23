package kh.edu.rupp.ite.mytravel.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.databinding.ActivityHomeBinding

class ActivityHome : AppCompatActivity() {


    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewhomepost1.setOnClickListener {
            imageViewhomepost1()
        }

    }

    private fun imageViewhomepost1() {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
