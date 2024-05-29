package com.example.gymmate

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gymmate.databinding.ActivityBackBinding
import com.example.gymmate.databinding.ActivityShoulderBinding

class ShoulderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShoulderBinding
    private lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityShoulderBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
             val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
             v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
             insets
         }*/

        binding.dumbbellLateralRaise.setBackgroundResource(/* resid = */ R.drawable.dumbbelllateralraise)
        animationDrawable = binding.dumbbellLateralRaise.background as AnimationDrawable
        animationDrawable.start()

        binding.cableOneArmLateralRaise.setBackgroundResource(/* resid = */ R.drawable.cableonearmlateralraise)
        animationDrawable = binding.cableOneArmLateralRaise.background as AnimationDrawable
        animationDrawable.start()

        binding.leverLateralRaise.setBackgroundResource(/* resid = */ R.drawable.leverlateralraise)
        animationDrawable = binding.leverLateralRaise.background as AnimationDrawable
        animationDrawable.start()

    }
}