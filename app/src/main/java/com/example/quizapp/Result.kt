package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quizapp.databinding.ActivityResultBinding

class Result : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding // Declare binding variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater) // Initialize binding
        setContentView(binding.root)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(setData.name)
        val score = intent.getIntExtra(setData.score, 0)
        val totalQuestion = intent.getIntExtra("total size", 0)

        binding.congo.text="Congratulations ${userName} !!"
        binding.Score.text="${score} / ${totalQuestion}"
        binding.button.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}