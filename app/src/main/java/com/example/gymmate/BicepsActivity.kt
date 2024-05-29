package com.example.gymmate

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gymmate.databinding.ActivityBicepsBinding
import com.example.gymmate.databinding.ActivityShoulderBinding

class BicepsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBicepsBinding
    private lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityBicepsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
             val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
             v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
             insets
         }*/

        binding.dumbbellBicepsCurl.setBackgroundResource(/* resid = */ R.drawable.dumbbellbicepscurl)
        animationDrawable = binding.dumbbellBicepsCurl.background as AnimationDrawable
        animationDrawable.start()

        binding.dumbbellHammerCurl.setBackgroundResource(/* resid = */ R.drawable.dumbbellhammercurl)
        animationDrawable = binding.dumbbellHammerCurl.background as AnimationDrawable
        animationDrawable.start()

        binding.dumbbellConcentrationCurl.setBackgroundResource(/* resid = */ R.drawable.dumbbellconcentrationcurl)
        animationDrawable = binding.dumbbellConcentrationCurl.background as AnimationDrawable
        animationDrawable.start()

        binding.ezBarbellCurl.setBackgroundResource(/* resid = */ R.drawable.ezbarbellcurl)
        animationDrawable = binding.ezBarbellCurl.background as AnimationDrawable
        animationDrawable.start()

        binding.cableCurl.setBackgroundResource(/* resid = */ R.drawable.cablecurl)
        animationDrawable = binding.cableCurl.background as AnimationDrawable
        animationDrawable.start()

        binding.dumbbellCloseGripCurl.setBackgroundResource(/* resid = */ R.drawable.dumbbellclosegripcurl)
        animationDrawable = binding.dumbbellCloseGripCurl.background as AnimationDrawable
        animationDrawable.start()

    }
}