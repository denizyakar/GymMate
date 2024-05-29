package com.example.gymmate

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gymmate.databinding.ActivityAbsBinding
import com.example.gymmate.databinding.ActivityTricepsBinding

class AbsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAbsBinding
    private lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAbsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
             val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
             v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
             insets
         }*/

        binding.sitUp.setBackgroundResource(/* resid = */ R.drawable.situp)
        animationDrawable = binding.sitUp.background as AnimationDrawable
        animationDrawable.start()

        binding.airBike.setBackgroundResource(/* resid = */ R.drawable.airbike)
        animationDrawable = binding.airBike.background as AnimationDrawable
        animationDrawable.start()

        binding.cableKneelingCrunch.setBackgroundResource(/* resid = */ R.drawable.cablekneelingcrunch)
        animationDrawable = binding.cableKneelingCrunch.background as AnimationDrawable
        animationDrawable.start()

        binding.armSlingersHangingBentKneeLegs.setBackgroundResource(/* resid = */ R.drawable.armslingershangingbentkneelegs)
        animationDrawable = binding.armSlingersHangingBentKneeLegs.background as AnimationDrawable
        animationDrawable.start()

        binding.cableKneelingSideCrunch.setBackgroundResource(/* resid = */ R.drawable.cablekneelingsidecrunch)
        animationDrawable = binding.cableKneelingSideCrunch.background as AnimationDrawable
        animationDrawable.start()

        binding.verticalLegRaise.setBackgroundResource(/* resid = */ R.drawable.verticallegraise)
        animationDrawable = binding.verticalLegRaise.background as AnimationDrawable
        animationDrawable.start()

    }
}