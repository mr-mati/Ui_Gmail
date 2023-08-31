package com.mati.gmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.mati.gmail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fristFragment()


        binding.bottomNavigationMain.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.mail -> {
                    replaceFragment(HomeFragment())
                }
                R.id.meet -> {
                    replaceFragment(MeetFragment())
                }
            }
            true
        }
        binding.bottomNavigationMain.setOnItemReselectedListener {  }

    }

    fun openAndCloseNavigationDrawer(view: View){
        if (binding.layoutDrawerMain.isDrawerOpen(GravityCompat.START)){
            binding.layoutDrawerMain.closeDrawer(binding.navigationDrawerMain)
        } else {
            binding.layoutDrawerMain.openDrawer(binding.navigationDrawerMain)
        }
    }

    private fun fristFragment() {
        binding.bottomNavigationMain.selectedItemId = R.id.mail
        replaceFragment(HomeFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        val transient = supportFragmentManager.beginTransaction()
        transient.replace(R.id.frame_main, fragment)
        transient.commit()
    }

}