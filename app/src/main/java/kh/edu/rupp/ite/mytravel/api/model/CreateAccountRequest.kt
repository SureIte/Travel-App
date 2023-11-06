package kh.edu.rupp.ite.mytravel.api.model

data class CreateAccountRequest(
        val email: String,
        val password: String,
        val full_name: String
)
