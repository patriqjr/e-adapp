package com.patriqjr.e_adapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.patriqjr.e_adapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val tabListener = object : OnTabSelectedListener {
        override fun onTabSelected(tab: TabLayout.Tab?) {

            when (tab!!.position) {
                0 -> {
                    moveToFragment(AboutFarmerFragment())
                    return
                }

                1 -> {
                    moveToFragment(EditFarmerFragment())
                    return
                }

                2 -> {
                    moveToFragment(ItemThreeFragment())
                    return
                }
            }
        }

        override fun onTabUnselected(tab: TabLayout.Tab?) {
        }

        override fun onTabReselected(tab: TabLayout.Tab?) {
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Item one"), true)
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Item two"), false)
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Item three"), false)
        binding.tabLayout.setOnTabSelectedListener(tabListener)
        moveToFragment(AboutFarmerFragment())
    }

    private fun moveToFragment(fragment: Fragment) {
        try {
            val fragmentTrans = supportFragmentManager.beginTransaction()
            fragmentTrans.replace(R.id.fragment_container, fragment)
            fragmentTrans.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}