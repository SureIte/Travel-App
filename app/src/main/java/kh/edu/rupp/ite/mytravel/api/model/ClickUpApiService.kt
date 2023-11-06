package kh.edu.rupp.ite.mytravel.api.model

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ClickUpApiService {
    @POST("user")
    suspend fun createAccount(@Body request: CreateAccountRequest): Response<YourResponseDataType>
    // Replace `YourResponseDataType` with the type you expect as a response.

    

}


