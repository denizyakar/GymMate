package com.example.gymmate

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gymmate.databinding.ActivityAbsBinding
import com.example.gymmate.databinding.ActivityLegBinding

class LegActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLegBinding
    private lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLegBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
             val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
             v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
             insets
         }*/

        binding.smithSquat.setBackgroundResource(/* resid = */ R.drawable.smithsquat)
        animationDrawable = binding.smithSquat.background as AnimationDrawable
        animationDrawable.start()

        binding.leverLegExtension.setBackgroundResource(/* resid = */ R.drawable.leverlegextension)
        animationDrawable = binding.leverLegExtension.background as AnimationDrawable
        animationDrawable.start()

        binding.leverLyingLegCurl.setBackgroundResource(/* resid = */ R.drawable.leverlyinglegcurl)
        animationDrawable = binding.leverLyingLegCurl.background as AnimationDrawable
        animationDrawable.start()

        binding.sledLegPress.setBackgroundResource(/* resid = */ R.drawable.sledlegpress)
        animationDrawable = binding.sledLegPress.background as AnimationDrawable
        animationDrawable.start()

        binding.leverSeatedCalfRaise.setBackgroundResource(/* resid = */ R.drawable.leverseatedcalfraise)
        animationDrawable = binding.leverSeatedCalfRaise.background as AnimationDrawable
        animationDrawable.start()

    }
}