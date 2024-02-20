package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val customMenu = CustomMenu()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMenu.setOnClickListener {
            customMenu.customMenu(this,it)
        }
    }
}