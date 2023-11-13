package kh.edu.rupp.ite.mytravel.view.fragment

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.mytravel.R

class HomeFragment : Fragment() {

    private var listener: OnButtonClickListener? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_home, container, false)

        // Button click listener
        view.findViewById<View>(R.id.buttonInFragment).setOnClickListener {
            listener?.onButtonClicked()
        }

        return view
    }

    interface OnButtonClickListener {
        fun onButtonClicked()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnButtonClickListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnButtonClickListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}


