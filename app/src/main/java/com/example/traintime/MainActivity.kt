package com.example.traintime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.traintime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.run {
            setContentView(root)

            navHostFragment.post {
                setSupportActionBar(toolBar)
                navController = navHostFragment.findNavController()
                appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment))
                setupActionBarWithNavController(navController, appBarConfiguration)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}