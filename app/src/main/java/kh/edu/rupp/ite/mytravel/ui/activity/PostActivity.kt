package kh.edu.rupp.ite.mytravel.ui.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R

public class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        // Reference the ImageView by its ID
        val picPost: ImageView = findViewById(R.id.imageView24)

        // Set an OnClickListener for the ImageView
        picPost.setOnClickListener {
            // Action to perform when the image is clicked (e.g., show a toast message)
            Toast.makeText(this, "Image Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
