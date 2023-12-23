package kh.edu.rupp.ite.mytravel.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.databinding.ActivityProvinceBinding

class SelectProvinceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProvinceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProvinceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewSelectPro.setOnClickListener{
            textViewSelectPro()
        }
    }

    private fun textViewSelectPro(){
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}