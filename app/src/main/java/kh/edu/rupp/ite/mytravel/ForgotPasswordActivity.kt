package kh.edu.rupp.ite.mytravel

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var sendPasswordButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        emailEditText = findViewById(R.id.emailEditText)
        sendPasswordButton = findViewById(R.id.sendPasswordButton)

        sendPasswordButton.setOnClickListener {
            val email = emailEditText.text.toString()

            // Implement your "Forgot Password" logic here
            // This is a simplified example; you would typically send a reset password email

            // Display a toast message to inform the user
            Toast.makeText(this, "Password send email sent to $email", Toast.LENGTH_SHORT).show()
        }
    }
}
