package kh.edu.rupp.ite.mytravel.view.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R

class ViewPostActivity : AppCompatActivity() {

    private lateinit var postTitleTextView: TextView
    private lateinit var postContentTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_item)

        postTitleTextView = findViewById(R.id.postTitleTextView)
        postContentTextView = findViewById(R.id.postContentTextView)

        // Retrieve post data from the intent or another data source
        val postTitle = intent.getStringExtra("postTitle")
        val postContent = intent.getStringExtra("postContent")

        // Set the post data to the TextViews
        postTitleTextView.text = postTitle
        postContentTextView.text = postContent
    }
}
