package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Mainactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Welcome", Toast.LENGTH_LONG).show()


        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener{

            if (it.itemId==R.id.Gaurd) {
                inflatefragment(GaurdFragment.newInstance())
            }
            else if(it.itemId == R.id.nav_home) {
                inflatefragment(HomeFragment.newInstance())
            } else if(it.itemId == R.id.nav_profile) {
                inflatefragment(profilefragment.newInstance())
            } else if(it.itemId == R.id.nav_dashboard) {
                inflatefragment(DashboardFragment.newInstance())
            }
            true

        }

        bottomBar.selectedItemId = R.id.nav_home

      }


    private fun inflatefragment(newinstance: Fragment)
    {
              val transaction = supportFragmentManager.beginTransaction()
              transaction.replace(R.id.container, newinstance)
              transaction.commit()
          }

    }



