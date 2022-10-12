package com.example.buttomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.buttomnavigation.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           binding= ActivityMainBinding.inflate(layoutInflater)
          setContentView(binding.root)



        // for buttom navigation
        val navController=findNavController(R.id.fragmentContainerView)
        setupWithNavController(binding.bottomNavigationView,navController)



        //for drawer navigation
        val toolbar = findViewById<Toolbar>(R.id.Toolbar)
        setSupportActionBar(toolbar)


        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_Nav)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        toggle.syncState()

         binding.navigation.setNavigationItemSelectedListener {

          when(it.itemId){
              R.id.querry   -> Toast.makeText(applicationContext, "your query request has been submitted we'll contact you back as soon as possible", Toast.LENGTH_SHORT).show()
              R.id.setting  -> Toast.makeText(applicationContext, "91+9211111111", Toast.LENGTH_SHORT).show()
          }
          true
      }

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
   }
}