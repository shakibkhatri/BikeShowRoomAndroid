package com.example.bikeshowroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.bikeshowroom.databinding.ActivitySportsBikeBinding

class SportsBike : AppCompatActivity() {

    private lateinit var binding: ActivitySportsBikeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySportsBikeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val KawasakiZXBike = findViewById<ImageButton>(R.id.btnBike1)

        KawasakiZXBike.setOnClickListener {
            intent = Intent(this, KawasakiZX::class.java)
            startActivity(intent)
        }
    }
}