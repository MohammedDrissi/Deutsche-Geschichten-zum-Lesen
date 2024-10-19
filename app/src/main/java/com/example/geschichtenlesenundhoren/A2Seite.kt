package com.example.geschichtenlesenundhoren

import a2_Geschichten.DerGeburtstagvonLena_laout
import a2_Geschichten.Der_neue_Schuler_layout
import a2_Geschichten.EinTagAmMeer_layout
import a2_Geschichten.Zoo_layout
import a2_Geschichten.ball_layout
import a2_Geschichten.fahrrad_laout
import a2_Geschichten.kino_layout
import a2_Geschichten.party_layout
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class A2Seite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_a2_seite)
        val BALL =findViewById<Button>(R.id.ball_button)
        BALL.setOnClickListener {
            val intent=Intent(this, ball_layout::class.java)
            startActivity(intent)
        }
        val NeueSchuler =findViewById<Button>(R.id.der_neue_schuler_button)
        NeueSchuler.setOnClickListener {
            val intent=Intent(this, Der_neue_Schuler_layout::class.java)
            startActivity(intent)
        }
        val LENAGEBURT =findViewById<Button>(R.id.der_Geburts_Tag_Von_Lena_button)
        LENAGEBURT.setOnClickListener {
            val intent=Intent(this, DerGeburtstagvonLena_laout::class.java)
            startActivity(intent)
        }
        val MEER =findViewById<Button>(R.id.ein_tag_im_meer_button)
        MEER.setOnClickListener {
            val intent=Intent(this, EinTagAmMeer_layout::class.java)
            startActivity(intent)
        }
        val FAHRRAD =findViewById<Button>(R.id.EinNeuseFahrrad_button)
        FAHRRAD.setOnClickListener {
            val intent=Intent(this, fahrrad_laout::class.java)
            startActivity(intent)
        }
        val KINO =findViewById<Button>(R.id.Kino_button)
        KINO.setOnClickListener {
            val intent=Intent(this, kino_layout::class.java)
            startActivity(intent)
        }
        val party =findViewById<Button>(R.id.Party_button)
        party.setOnClickListener {
            val intent=Intent(this, party_layout::class.java)
            startActivity(intent)
        }
        val schnee =findViewById<Button>(R.id.imSchnee_button)
        schnee.setOnClickListener {
            val intent=Intent(this, ball_layout::class.java)
            startActivity(intent)
        }


        val ZOO =findViewById<Button>(R.id.Zoo_button)
        ZOO.setOnClickListener {
            val intent=Intent(this, Zoo_layout::class.java)
            startActivity(intent)
        }









    }


}

