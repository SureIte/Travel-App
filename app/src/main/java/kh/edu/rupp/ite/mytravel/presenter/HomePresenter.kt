package kh.edu.rupp.ite.mytravel.presenter

import kh.edu.rupp.ite.mytravel.api.model.Home
import kh.edu.rupp.ite.mytravel.api.service.APIService
import kh.edu.rupp.ite.mytravel.view.HomeView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HomePresenter(private val view: HomeView) {

    fun loadHome(){

        // Create retrofit click
        val httpClient = Retrofit.Builder()
                .baseUrl("https://tests3bk.s3.ap-southeast-1.amazonaws.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        // Create service abject
        val apiService = httpClient.create(APIService::class.java)

        // Load home list from service
        val task = apiService.loadHomeList()
        task.enqueue(object : Callback<List<Home>> {
            override fun onResponse(
            call: Call<List<Home>>,
            response: Response<List<Home>>
            ){
                if(response.isSuccessful){

                }else{

                }
            }
            override fun onFailure(call: Call<List<Home>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })


    }


}

private fun Any.enqueue(callback: Callback<List<Home>>) {

}
