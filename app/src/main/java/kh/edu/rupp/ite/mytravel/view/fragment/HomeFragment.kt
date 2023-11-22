package kh.edu.rupp.ite.mytravel.view.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.mytravel.R
import kh.edu.rupp.ite.mytravel.view.activity.HomeActivity

class HomeFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Assuming there's a button with ID 'startHomeActivityButton'
        view.findViewById<View>(R.id.buttonInFragment).setOnClickListener {
            startHomeActivity()
        }

        return view
    }

    private fun startHomeActivity() {
        val intent = Intent(activity, HomeActivity::class.java)
        startActivity(intent)
    }
}



