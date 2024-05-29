package com.example.gymmate

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gymmate.databinding.ActivityBackBinding
import com.example.gymmate.databinding.ActivityChestBinding

class BackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBackBinding
    private lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityBackBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
             val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
             v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
             insets
         }*/

        binding.latPulldown.setBackgroundResource(/* resid = */ R.drawable.latpulldown)
        animationDrawable = binding.latPulldown.background as AnimationDrawable
        animationDrawable.start()

        binding.dumbbellBentOverRow.setBackgroundResource(/* resid = */ R.drawable.dumbbellbentoverrow)
        animationDrawable = binding.dumbbellBentOverRow.background as AnimationDrawable
        animationDrawable.start()

        binding.barbellBentOverRow.setBackgroundResource(/* resid = */ R.drawable.barbellbentoverrow)
        animationDrawable = binding.barbellBentOverRow.background as AnimationDrawable
        animationDrawable.start()

        binding.cableLowSeatedRow.setBackgroundResource(/* resid = */ R.drawable.cablelowseatedrow)
        animationDrawable = binding.cableLowSeatedRow.background as AnimationDrawable
        animationDrawable.start()

        binding.dumbbellInclineRow.setBackgroundResource(/* resid = */ R.drawable.dumbbellinclinerow)
        animationDrawable = binding.dumbbellInclineRow.background as AnimationDrawable
        animationDrawable.start()

        binding.dumbbellShrug.setBackgroundResource(/* resid = */ R.drawable.dumbbellshrug)
        animationDrawable = binding.dumbbellShrug.background as AnimationDrawable
        animationDrawable.start()

    }
}