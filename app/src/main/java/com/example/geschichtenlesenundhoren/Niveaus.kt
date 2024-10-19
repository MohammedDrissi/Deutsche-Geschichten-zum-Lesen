package com.example.geschichtenlesenundhoren

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Niveaus : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_niveaus)
        val A1Niveau = findViewById<Button>(R.id.a1button)
        A1Niveau.setOnClickListener {
            val intent = Intent(this, A1Seite::class.java)
            startActivity(intent)
        }
        val A2Niveau = findViewById<Button>(R.id.a2button)
        A2Niveau.setOnClickListener {
            val intent = Intent(this, A2Seite::class.java)
            startActivity(intent)
        }
        val B1Niveau = findViewById<Button>(R.id.b1button)
        B1Niveau.setOnClickListener {
            val intent = Intent(this, B1Geschichte::class.java)
            startActivity(intent)
        }
        val B2Niveau = findViewById<Button>(R.id.b2button)
        B2Niveau.setOnClickListener {
            val intent = Intent(this, B2Seite::class.java)
            startActivity(intent)

        }
        val C1Niveau = findViewById<Button>(R.id.c1button)
        C1Niveau.setOnClickListener {
            val intent = Intent(this, C1Seite::class.java)
            startActivity(intent)
        }

    }}