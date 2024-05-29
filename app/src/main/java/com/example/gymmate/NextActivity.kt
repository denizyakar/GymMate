package com.example.gymmate

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gymmate.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intentFromMain = intent

        val myUserName = intentFromMain.getStringExtra("username")
        val myPassword = intentFromMain.getStringExtra("password")
        binding.userNameText.text = "${myUserName}"

    }

    fun logout(view : View) {
        val intent = Intent(this@NextActivity, MainActivity::class.java)
        Toast.makeText(this@NextActivity, "You Logged Out", Toast.LENGTH_LONG).show()
        startActivity(intent)
        finish()
    }

    fun chest(view : View) {
        val intent = Intent(this@NextActivity, ChestActivity::class.java)
        startActivity(intent)
    }

    fun back(view : View) {
        val intent = Intent(this@NextActivity, BackActivity::class.java)
        startActivity(intent)
    }

    fun shoulder(view : View) {
        val intent = Intent(this@NextActivity, ShoulderActivity::class.java)
        startActivity(intent)
    }

    fun biceps(view : View) {
        val intent = Intent(this@NextActivity, BicepsActivity::class.java)
        startActivity(intent)
    }

    fun triceps(view : View) {
        val intent = Intent(this@NextActivity, TricepsActivity::class.java)
        startActivity(intent)
    }

    fun abs(view : View) {
        val intent = Intent(this@NextActivity, AbsActivity::class.java)
        startActivity(intent)
    }

    fun leg(view : View) {
        val intent = Intent(this@NextActivity, LegActivity::class.java)
        startActivity(intent)
    }

}