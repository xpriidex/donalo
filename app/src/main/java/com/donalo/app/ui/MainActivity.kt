package com.donalo.app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.donalo.app.R

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNavController()
        setupActionBar()
        destinationManager()
    }

    private fun setupActionBar() {
        val appBarConfiguration = AppBarConfiguration
            .Builder(
                R.id.loginFragment,
                R.id.donationListFragment
            )
            .build()

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
    }

    //Setting Up the back button
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, null)
    }

    private fun setupNavController() {
        navController = Navigation.findNavController(
            this,
            R.id.navHostFragment
        )
    }

    private fun destinationManager() {
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            //   supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_arrow_back_blue)

            when (destination.id) {
                R.id.splashFragment, R.id.loginFragment -> {
                    supportActionBar?.hide()
                }

                else -> {
                    supportActionBar?.show()
                }
            }
        }
    }
}