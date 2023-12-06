package kh.edu.rupp.ite.mytravel.view.activity


import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Your HomeActivity initialization code

        // Trigger the transition to ActivityHome when needed, e.g., on button click
        val yourButton = null
        yourButton.setOnClickListener {
            val intent = Intent(this, ActivityHome::class.java)
            startActivity(intent)
        }
    }
}

private fun Nothing?.setOnClickListener(function: () -> Unit) {

}