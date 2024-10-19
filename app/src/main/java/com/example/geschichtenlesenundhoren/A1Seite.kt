package com.example.geschichtenlesenundhoren

import a1geschichten.Ausflug
import a1geschichten.DieKatzeUndDerHundGeschichten
import a1geschichten.DieReise
import a1geschichten.Freundschaft
import a1geschichten.Geburtstagsfeier
import a1geschichten.GebutsTag
import a1geschichten.Schuler
import a1geschichten.Spielzeug
import a1geschichten.Supermarkt
import a1geschichten.Vogel
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button


class A1Seite : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a1_seite)
        val lisaGeburtsTag = findViewById<Button>(R.id.GeburtsTag)
        lisaGeburtsTag.setOnClickListener {
            val intent = Intent(this, GebutsTag::class.java)
            startActivity(intent)

        }
        val dieKatzeUndDerHundGeschichtennn = findViewById<Button>(R.id.dieKatze_derhund)
        dieKatzeUndDerHundGeschichtennn.setOnClickListener {
            val intent = Intent(this, DieKatzeUndDerHundGeschichten::class.java)
            startActivity(intent)
        }
        val dieReisee = findViewById<Button>(R.id.dieReise)
        dieReisee.setOnClickListener {
            val intent = Intent(this, DieReise::class.java)
            startActivity(intent)
        }
        val spielZeug = findViewById<Button>(R.id.spielZeug)
        spielZeug.setOnClickListener {
            val intent = Intent(this, Spielzeug::class.java)
            startActivity(intent)
        }
        val AusFlug = findViewById<Button>(R.id.ausFlug)
        AusFlug.setOnClickListener {
            val intent = Intent(this, Ausflug::class.java)
            startActivity(intent)
        }
        val DieFreundschaft = findViewById<Button>(R.id.dieFreundschaft)
        DieFreundschaft.setOnClickListener {
            val intent = Intent(this, Freundschaft::class.java)
            startActivity(intent)


            val SCHULER = findViewById<Button>(R.id.Schuler)
            SCHULER.setOnClickListener {
                val intent = Intent(this, Schuler::class.java)
                startActivity(intent)
            }
            val Vogell = findViewById<Button>(R.id.vogel)
            Vogell.setOnClickListener {
                val intent = Intent(this, Vogel::class.java)
                startActivity(intent)
            }
            val Geburtstagsfeiern = findViewById<Button>(R.id.Geburtstagsfeier)
            Geburtstagsfeiern.setOnClickListener {
                val intent = Intent(this, Geburtstagsfeier::class.java)
                startActivity(intent)
            }
            val Supermarkte = findViewById<Button>(R.id.supermarkt)
            Supermarkte.setOnClickListener {
                val intent = Intent(this, Supermarkt::class.java)
                startActivity(intent)
            }


        }
    }
    }
