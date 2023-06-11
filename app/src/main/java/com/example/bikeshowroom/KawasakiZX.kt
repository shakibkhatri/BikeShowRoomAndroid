package com.example.bikeshowroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KawasakiZX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kawasaki_zx)

        val buyButton = findViewById<Button>(R.id.btnBuy)

        buyButton.setOnClickListener {
            intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }
    }
}