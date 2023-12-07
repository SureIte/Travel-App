package kh.edu.rupp.ite.mytravel.view

import android.os.Bundle
import android.view.View
import kh.edu.rupp.ite.mytravel.api.model.HomeModel

interface HomeView {

    fun showHomeList(home: List<HomeModel>)

    fun showError(message: String)
    fun onViewCreate(view: View, savedInstanceState: Bundle?)
}