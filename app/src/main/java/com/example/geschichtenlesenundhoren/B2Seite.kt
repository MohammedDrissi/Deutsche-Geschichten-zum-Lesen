package com.example.geschichtenlesenundhoren

import B2Geschichten.B2DasGeheimnisDesWaldes
import B2Geschichten.B2DasVerloreneTagebuch
import B2Geschichten.B2DasVerschwundeneGemalde
import B2Geschichten.B2DerGrosseWettlauf
import B2Geschichten.B2DerLetzteFlug
import B2Geschichten.B2DerMysterioseFremde
import B2Geschichten.B2DieReiseDerTraume
import B2Geschichten.B2DieReiseInDieBerge
import B2Geschichten.B2DieVerborgeneBibliothek
import B2Geschichten.B2DieVerloreneStadt
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class B2Seite : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b2_seite)


        val dasGeheimnisDesWaldes =findViewById<Button>(R.id.Das_Geheimnis_des_Waldes_button)
        dasGeheimnisDesWaldes.setOnClickListener {
            val intent= Intent(this, B2DasGeheimnisDesWaldes::class.java)
            startActivity(intent)
        }

        val DasVerloreneTagebuch =findViewById<Button>(R.id.Das_verlorene_Tagebuch_button)
        DasVerloreneTagebuch.setOnClickListener {
            val intent= Intent(this, B2DasVerloreneTagebuch::class.java)
            startActivity(intent)
        }

        val DasVerschwundeneGemalde =findViewById<Button>(R.id.Das_verschwundene_Gemälde_button)
        DasVerschwundeneGemalde.setOnClickListener {
            val intent= Intent(this, B2DasVerschwundeneGemalde::class.java)
            startActivity(intent)
        }

        val DerGrosseWettlauf =findViewById<Button>(R.id.Der_große_Wettlauf_button)
        DerGrosseWettlauf.setOnClickListener {
            val intent= Intent(this, B2DerGrosseWettlauf::class.java)
            startActivity(intent)
        }

        val DerLetzteFlug =findViewById<Button>(R.id.Der_letzte_Flug_button)
        DerLetzteFlug.setOnClickListener {
            val intent= Intent(this, B2DerLetzteFlug::class.java)
            startActivity(intent)
        }

        val DerMysterioseFremde =findViewById<Button>(R.id.Der_mysteriöse_Fremde_button)
        DerMysterioseFremde.setOnClickListener {
            val intent= Intent(this, B2DerMysterioseFremde::class.java)
            startActivity(intent)
        }

        val DieReiseDerTraume =findViewById<Button>(R.id.Die_Reise_der_Träume_button)
        DieReiseDerTraume.setOnClickListener {
            val intent= Intent(this, B2DieReiseDerTraume::class.java)
            startActivity(intent)
        }



        val DieReiseInDieBerge =findViewById<Button>(R.id.Die_Reise_in_die_Berge_button)
        DieReiseInDieBerge.setOnClickListener {
            val intent= Intent(this, B2DieReiseInDieBerge::class.java)
            startActivity(intent)
        }
        val DieVerborgeneBibliothek =findViewById<Button>(R.id.Die_verborgene_Bibliothek_button)
        DieVerborgeneBibliothek.setOnClickListener {
            val intent= Intent(this, B2DieVerborgeneBibliothek::class.java)
            startActivity(intent)
        }

        val DieVerloreneStadt =findViewById<Button>(R.id.Die_verlorene_Stadt_button)
        DieVerloreneStadt.setOnClickListener {
            val intent= Intent(this, B2DieVerloreneStadt::class.java)
            startActivity(intent)
        }


    }}