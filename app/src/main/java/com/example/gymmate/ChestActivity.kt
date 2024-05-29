package com.example.gymmate

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.gymmate.databinding.ActivityChestBinding

class ChestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChestBinding
    private lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityChestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        binding.dumbbellBenchPress.setBackgroundResource(/* resid = */ R.drawable.dumbbell_bench_press)
        animationDrawable = binding.dumbbellBenchPress.background as AnimationDrawable
        animationDrawable.start()

        binding.dumbbellInclineBenchPress.setBackgroundResource(/* resid = */ R.drawable.dumbbell_incline_bench_press)
        animationDrawable = binding.dumbbellInclineBenchPress.background as AnimationDrawable
        animationDrawable.start()

        binding.dumbbellFly.setBackgroundResource(/* resid = */ R.drawable.dumbbell_fly)
        animationDrawable = binding.dumbbellFly.background as AnimationDrawable
        animationDrawable.start()

        binding.cableLowChestPress.setBackgroundResource(/* resid = */ R.drawable.cablelowchestpress)
        animationDrawable = binding.cableLowChestPress.background as AnimationDrawable
        animationDrawable.start()

        binding.barbellBenchPress.setBackgroundResource(/* resid = */ R.drawable.barbellbenchpress)
        animationDrawable = binding.barbellBenchPress.background as AnimationDrawable
        animationDrawable.start()

        binding.chestDip.setBackgroundResource(/* resid = */ R.drawable.chestdip)
        animationDrawable = binding.chestDip.background as AnimationDrawable
        animationDrawable.start()

    }
}