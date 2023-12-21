package kh.edu.rupp.ite.mytravel.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.databinding.ActivityForgotPasswordBinding

class ForgetPasswordActivity : AppCompatActivity() {


    private lateinit var binding: ActivityForgotPasswordBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}