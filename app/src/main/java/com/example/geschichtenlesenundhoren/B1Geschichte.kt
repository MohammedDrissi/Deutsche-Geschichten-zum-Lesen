package com.example.geschichtenlesenundhoren


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import b1Geschichte.B1_DieNeueSchule
import b1Geschichte.DasGeheimeVersteck
import b1Geschichte.DasGeheimnisDesAltenHauses
import b1Geschichte.DerNeueNachbar
import b1Geschichte.DerVerloreneHund
import b1Geschichte.DerWintermarkt
import b1Geschichte.DerZauberkunstlerImPark
import b1Geschichte.DieReiseAnsMeer
import b1Geschichte.EinAbenteuerImWald
import b1Geschichte.EinTagImTierpark

class B1Geschichte : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_b1_geschichte)
        val NeueSchule =findViewById<Button>(R.id.Die_neue_Schule_button)
        NeueSchule.setOnClickListener {
            val intent= Intent(this, B1_DieNeueSchule::class.java)
            startActivity(intent)
        }
        val GeheimeVersteck =findViewById<Button>(R.id.Das_geheime_Versteck_button)
        GeheimeVersteck.setOnClickListener {
            val intent= Intent(this, DasGeheimeVersteck::class.java)
            startActivity(intent)
        }
        val dasGeheimnisDesAltenHauses =findViewById<Button>(R.id.Das_Geheimnis_des_alten_Hauses_button)
        dasGeheimnisDesAltenHauses.setOnClickListener {
            val intent= Intent(this, DasGeheimnisDesAltenHauses::class.java)
            startActivity(intent)
        }
        val DerNeueNachbarb1=findViewById<Button>(R.id.Der_neue_Nachbar_button)
        DerNeueNachbarb1.setOnClickListener {
            val intent= Intent(this, DerNeueNachbar::class.java)
            startActivity(intent)
        }
        val DerVerloreneHundb1=findViewById<Button>(R.id.Der_verlorene_Hund)
        DerVerloreneHundb1.setOnClickListener {
            val intent= Intent(this, DerVerloreneHund::class.java)
            startActivity(intent)
        }
        val DerWintermarktb1 =findViewById<Button>(R.id.Der_Wintermarkt_button)
        DerWintermarktb1.setOnClickListener {
            val intent= Intent(this, DerWintermarkt ::class.java)
            startActivity(intent)
        }
        val DerZauberkunstlerImParkb1 =findViewById<Button>(R.id.Der_Zauberkünstler_im_Park_button)
        DerZauberkunstlerImParkb1.setOnClickListener {
            val intent= Intent(this, DerZauberkunstlerImPark::class.java)
            startActivity(intent)
        }
        val DieReiseAnsMeerb1=findViewById<Button>(R.id.Die_Reise_ans_Meer_button)
        DieReiseAnsMeerb1.setOnClickListener {
            val intent= Intent(this, DieReiseAnsMeer::class.java)
            startActivity(intent)
        }
        val EinAbenteuerImWaldb1 =findViewById<Button>(R.id.Ein_Abenteuer_im_Wald_button)
        EinAbenteuerImWaldb1.setOnClickListener {
            val intent= Intent(this, EinAbenteuerImWald::class.java)
            startActivity(intent)
        }
        val EinTagImTierparkb1 =findViewById<Button>(R.id.Ein_Tag_im_Tierpark_button)
        EinTagImTierparkb1.setOnClickListener {
            val intent= Intent(this, EinTagImTierpark ::class.java)
            startActivity(intent)
        }}}

