package kh.edu.rupp.ite.mytravel.view.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R

class ActivityHome : AppCompatActivity() {

    @SuppressLint("WrongViewCast", "SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)


        // Retrieving a TextView from the layout and updating its text
        val textView = findViewById<TextView>(R.id.txtAllCourses)
        textView.text = "Welcome to the Home Activity!"

        // Setting an OnClickListener for a button
        val button = findViewById<Button>(R.id.editTextTextPersonName)
        button.setOnClickListener {

            // action when the button is clicked button home
           Toast.makeText(this@ActivityHome, "Button clicked!", Toast.LENGTH_SHORT).show()
        }
    }

}
