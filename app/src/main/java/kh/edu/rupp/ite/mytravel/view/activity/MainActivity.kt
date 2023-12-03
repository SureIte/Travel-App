package kh.edu.rupp.ite.mytravel.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.mytravel.R
import kh.edu.rupp.ite.mytravel.databinding.ActivityMainBinding
import kh.edu.rupp.ite.mytravel.view.fragment.HomeFragment
import kh.edu.rupp.ite.mytravel.view.fragment.MoreFragment
import kh.edu.rupp.ite.mytravel.view.fragment.PlanFragment
import kh.edu.rupp.ite.mytravel.view.fragment.PostFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showFragment(HomeFragment())

        // button item action to fragment
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.mnuHome -> showFragment(HomeFragment())
                R.id.mnuPost -> showFragment(PostFragment())
                R.id.mnuPlan -> showFragment(PlanFragment())
                else -> showFragment(MoreFragment())
            }
            true
        }
    }

    // Function Show Fragment
    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
    }
}