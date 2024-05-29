package com.example.gymmate

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gymmate.databinding.ActivityBicepsBinding
import com.example.gymmate.databinding.ActivityTricepsBinding

class TricepsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTricepsBinding
    private lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTricepsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
             val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
             v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
             insets
         }*/

        binding.cablePushdown.setBackgroundResource(/* resid = */ R.drawable.cablepushdown)
        animationDrawable = binding.cablePushdown.background as AnimationDrawable
        animationDrawable.start()

        binding.ezBarTricepsExtension.setBackgroundResource(/* resid = */ R.drawable.ezbartricepsextension)
        animationDrawable = binding.ezBarTricepsExtension.background as AnimationDrawable
        animationDrawable.start()

        binding.cableOneArmTricepPushdown.setBackgroundResource(/* resid = */ R.drawable.cableonearmtriceppushdown)
        animationDrawable = binding.cableOneArmTricepPushdown.background as AnimationDrawable
        animationDrawable.start()

        binding.oldSchoolReverseExtensions.setBackgroundResource(/* resid = */ R.drawable.oldschoolreverseextensions)
        animationDrawable = binding.oldSchoolReverseExtensions.background as AnimationDrawable
        animationDrawable.start()

        binding.dumbbellInclineTricepsKickback.setBackgroundResource(/* resid = */ R.drawable.dumbbellinclinetricepskickback)
        animationDrawable = binding.dumbbellInclineTricepsKickback.background as AnimationDrawable
        animationDrawable.start()

        binding.dumbbellStandingTricepsExtension.setBackgroundResource(/* resid = */ R.drawable.dumbbellstandingtricepsextension)
        animationDrawable = binding.dumbbellStandingTricepsExtension.background as AnimationDrawable
        animationDrawable.start()

    }
}