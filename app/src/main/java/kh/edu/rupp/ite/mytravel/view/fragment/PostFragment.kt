package kh.edu.rupp.ite.mytravel.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.mytravel.R
import kh.edu.rupp.ite.mytravel.databinding.FragmentPostBinding


class PostFragment : Fragment() {

    private var _binding: FragmentPostBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentPostBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.textViewSeeAll.setOnClickListener {
            navigateToSeeAllFragment()
        }

        binding.textPostAll.setOnClickListener {
            navigateToSeeAllFragment()
        }

        return view
    }
        private fun navigateToSeeAllFragment() {
            val itemFragment = ItemFragment()
            parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, itemFragment)
                    .addToBackStack(null)
                    .commit()
        }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    }


