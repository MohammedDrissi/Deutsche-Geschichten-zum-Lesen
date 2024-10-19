package com.example.geschichtenlesenundhoren

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat


class C1Seite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_c1_seite)
        val DieSchattenderVergangenheit=findViewById<Button>(R.id.Die_Schatten_der_Vergangenheit_button)
        DieSchattenderVergangenheit.setOnClickListener {
            val intent=Intent(this,C1DieSchattenDerVergangenheit::class.java)
            startActivity(intent)
        }
        val DieVerborgeneWahrheit=findViewById<Button>(R.id.Die_Verborgene_Wahrheit_button)
        DieVerborgeneWahrheit.setOnClickListener {
            val intent = Intent(this, C1DieVerborgeneWahrheit::class.java)
            startActivity(intent)

        }
        val DieRückkehrdesReisenden=findViewById<Button>(R.id.Die_Rückkehr_des_Reisenden_button)
        DieRückkehrdesReisenden.setOnClickListener {
            val intent = Intent(this, C1DieRuckkehrDesReisenden::class.java)
            startActivity(intent)

        }
        val DasGeheimnisDeraltenBibliothek=findViewById<Button>(R.id.Das_Geheimnis_der_alten_Bibliothek_button)
        DasGeheimnisDeraltenBibliothek.setOnClickListener {
            val intent = Intent(this, C1DasGeheimnisDerAltenBibliothek::class.java)
            startActivity(intent)



        }
        val DasErbederWellen=findViewById<Button>(R.id.Das_Erbe_der_Wellen_button)
        DasErbederWellen.setOnClickListener {
            val intent = Intent(this, C1DasErbeDerWellen::class.java)
            startActivity(intent)

        }
        val Die_Farben_der_Erinnerung=findViewById<Button>(R.id.Die_Farben_der_Erinnerung_button)
        Die_Farben_der_Erinnerung.setOnClickListener {
            val intent = Intent(this, C1DieFarbenderErinnerung::class.java)
            startActivity(intent)

        }
        val Der_Klang_der_Stille=findViewById<Button>(R.id.Der_Klang_der_Stille_button)
        Der_Klang_der_Stille.setOnClickListener {
            val intent = Intent(this, C1DerKlangDerStille::class.java)
            startActivity(intent)

        }
        val Die_Brücke_der_Träume=findViewById<Button>(R.id.Die_Brücke_der_Träume_button)
        Die_Brücke_der_Träume.setOnClickListener {
            val intent = Intent(this, C1DieBruckederTraume::class.java)
            startActivity(intent)

        }



    }}



