package kh.edu.rupp.ite.mytravel.api.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel {

    class LoginViewModel : ViewModel() {

        private val _loginStatus = MutableLiveData<Boolean>()
        val loginStatus: LiveData<Boolean>
            get() = _loginStatus

        fun loginUser(email: String, password: String) {
            // login if email is "email" and password is "password"

            val isLoggedIn = email == "email" && password == "password"
            _loginStatus.value = isLoggedIn
        }
    }

}