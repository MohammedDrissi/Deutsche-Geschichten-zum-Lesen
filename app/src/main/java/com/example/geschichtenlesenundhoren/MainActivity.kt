package com.example.geschichtenlesenundhoren

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val ErsteSeite =findViewById<Button>(R.id.sofort_beginnen_button)
        ErsteSeite.setOnClickListener {
            val intent =Intent(this,Niveaus::class.java)
            startActivity(intent)
        }
        val Ratten =findViewById<Button>(R.id.Tipps_vor_dem_start)
        Ratten.setOnClickListener {
            val intent =Intent(this,Advice::class.java)
            startActivity(intent)
        }
        }


        }

