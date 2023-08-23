package com.giuliana.evaluacioncontinuacuatro.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.giuliana.evaluacioncontinuacuatro.R
import com.giuliana.evaluacioncontinuacuatro.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHeadFragment=supportFragmentManager.findFragmentById(R.id.fcv_rickimorti) as NavHostFragment
        val navController=navHeadFragment.navController
        binding.bnvMenu.setupWithNavController(navController)
    }
}