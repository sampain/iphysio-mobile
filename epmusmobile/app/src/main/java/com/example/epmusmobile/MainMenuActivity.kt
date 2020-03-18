package com.example.epmusmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        // toolbar support
        setSupportActionBar(findViewById(R.id.my_toolbar))

        val programme = findViewById<Button>(R.id.activity_programme)
        val statistiques = findViewById<Button>(R.id.activity_statistiques)
        val messagerie = findViewById<Button>(R.id.activity_messagerie)
        val alertes = findViewById<Button>(R.id.activity_alertes)

        programme.setOnClickListener{
            val intent = Intent(this@MainMenuActivity, ProgrammeActivity::class.java)
            startActivity(intent)
        }

        statistiques.setOnClickListener{
            val intent = Intent(this@MainMenuActivity, StatistiquesActivity::class.java)
            startActivity(intent)
        }

        messagerie.setOnClickListener{
            val intent = Intent(this@MainMenuActivity, MessagerieActivity::class.java)
            startActivity(intent)
        }

        alertes.setOnClickListener{
            val intent = Intent(this@MainMenuActivity, AlertesActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_actions, menu)
        return true
    }
}
