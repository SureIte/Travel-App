package kh.edu.rupp.ite.mytravel

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Reference the button by its ID
        val buttonHome: Button = findViewById(R.id.button_home)

        // Set an OnClickListener for the button
        buttonHome.setOnClickListener {
            // Action to perform when the button is clicked (e.g., show a toast message)
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
