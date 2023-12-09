package kh.edu.rupp.ite.mytravel.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.mytravel.databinding.FragmentHomeBinding
import kh.edu.rupp.ite.mytravel.databinding.FragmentPlanBinding


class PlanFragment : Fragment() {
    private var binding: FragmentPlanBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPlanBinding.inflate(layoutInflater)
        return binding!!.getRoot()
    }
}



