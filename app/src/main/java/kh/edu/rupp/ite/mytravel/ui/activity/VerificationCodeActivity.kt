package kh.edu.rupp.ite.mytravel.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.mytravel.R

class VerificationCodeActivity : AppCompatActivity() {

    private lateinit var verificationCodeEditText: EditText
    private lateinit var verifyCodeButton: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_code)

        verificationCodeEditText = findViewById(R.id.verificationCodeEditText)
        verifyCodeButton = findViewById(R.id.verifyCodeButton)


        verifyCodeButton.setOnClickListener {
            val verificationCode = verificationCodeEditText.text.toString()

            // Implement your verification code logic here
            // This is a simplified example; you should compare the code with the expected value

            if (verificationCode == "1234") { // Replace with the expected verification code
                // Verification successful, perform the appropriate action
                Toast.makeText(this, "Verification successful", Toast.LENGTH_SHORT).show()
                // You can navigate to the next screen, enable the account, or take any other action
            } else {
                // Verification failed, display an error message
                Toast.makeText(this, "Verification code is incorrect", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
