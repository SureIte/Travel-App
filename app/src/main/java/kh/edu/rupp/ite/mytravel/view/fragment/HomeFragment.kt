package kh.edu.rupp.ite.mytravel.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.mytravel.R
import kh.edu.rupp.ite.mytravel.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var binding: FragmentHomeBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding!!.getRoot()

        val nameList = arrayListOf("showPost", "showPostAll",)
        val provinceList = arrayListOf("listkohkong_pic", "textNamekohkong")


        val imageList = arrayListOf(
                R.drawable.photo,
                R.drawable.photo10,


        )
    }
}



