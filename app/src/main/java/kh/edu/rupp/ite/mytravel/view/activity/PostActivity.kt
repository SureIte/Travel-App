package kh.edu.rupp.ite.mytravel.view.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R

public class PostActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        // Reference the ImageView by its ID
        val picPost: TextView = findViewById(R.id.TextPostAll)

        // Set an OnClickListener for the ImageView
        picPost.setOnClickListener {
            // Action to perform when the image is clicked (e.g., show a toast message)
            Toast.makeText(this, "Image Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
