package com.example.sh_34

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.sh_34.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textHello.setOnClickListener {
            binding.textHello.setTextColor(Color.BLUE)
        }

        binding.textGroup.setOnClickListener {
            binding.textGroup.setTextColor(Color.YELLOW)
        }

        binding.textCity.setOnClickListener {
            binding.textCity.setTextColor(Color.GREEN)
        }

        binding.buttonHide.setOnClickListener {
            binding.textHello.visibility = View.GONE
        }

        binding.buttonShow.setOnClickListener {
            binding.textHello.visibility = View.VISIBLE
        }
    }
}
