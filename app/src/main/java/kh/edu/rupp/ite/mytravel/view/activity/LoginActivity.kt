package kh.edu.rupp.ite.mytravel.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kh.edu.rupp.ite.mytravel.R
import kh.edu.rupp.ite.mytravel.api.model.LoginViewModel


class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_login)
//
//        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
//
//        loginButton.setOnClickListener {
//            val email = emailEditText.text.toString()
//            val password = passwordEditText.text.toString()
//
//            loginViewModel.loginUser(email, password)
//        }
//
//        loginViewModel.loginStatus.observe(this, Observer { isLoggedIn ->
//            if (isLoggedIn) {
//
//                // Successful login logic, navigate to the next screen or perform actions
//
//                showToast("Login successful")
//            } else {
//                // Display error message or handle unsuccessful login
//                showToast("Invalid username or password")
//            }
//        })
//    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}


