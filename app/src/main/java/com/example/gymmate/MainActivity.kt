package com.example.gymmate

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gymmate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun login(view: View) {
        val userName = binding.textInputEditText.text.toString().trim()
        val password = binding.textInputEditText2.text.toString().trim()

        if (userName.isNotEmpty() && password.isNotEmpty()) {
            val intent = Intent(this@MainActivity, NextActivity::class.java).apply {
                putExtra("username", userName)
                putExtra("password", password)
            }
            Toast.makeText(this@MainActivity, "You Logged In", Toast.LENGTH_LONG).show()
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this@MainActivity, "Please enter your information correctly", Toast.LENGTH_LONG).show()
        }
    }


}