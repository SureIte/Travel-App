package kh.edu.rupp.ite.mytravel.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.databinding.ActivityPostBinding

public class PostActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.TextViewPost.setOnClickListener {
            TextViewPost()
        }

    }

    private fun TextViewPost(){
        var intent = Intent(this, ViewItemActivity::class.java)
        startActivity(intent)
    }
}
