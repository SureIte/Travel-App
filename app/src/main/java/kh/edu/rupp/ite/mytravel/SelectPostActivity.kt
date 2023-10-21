package kh.edu.rupp.ite.mytravel

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class SelectPostActivity : AppCompatActivity() {

    private lateinit var selectProvincePost: Spinner

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_province)

        selectProvincePost = findViewById(R.id.selectProvincePost)

        // Create an ArrayAdapter with post titles (or other relevant data)
        val postTitles = arrayOf("Post 1", "Post 2", "Post 3") // Replace with your post data
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, postTitles)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Set the adapter for the Spinner
        selectProvincePost.adapter = adapter
    }
}
