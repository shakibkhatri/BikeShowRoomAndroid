package com.example.bikeshowroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.bikeshowroom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val SportsBikeButton = findViewById<ImageButton>(R.id.btnSports)
        SportsBikeButton.setOnClickListener {
            intent = Intent(this, SportsBike::class.java)
            startActivity(intent)
        }
    }
}