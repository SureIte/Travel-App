package kh.edu.rupp.ite.mytravel.view

import android.os.Bundle
import android.os.Message
import android.view.View
import kh.edu.rupp.ite.mytravel.api.model.Home

interface HomeView {

    fun showHomeList(home: List<Home>)

    fun showError(message: String)
    fun onViewCreate(view: View, savedInstanceState: Bundle?)
}