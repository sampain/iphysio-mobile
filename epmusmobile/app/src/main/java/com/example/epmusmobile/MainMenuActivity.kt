package com.example.epmusmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.example.epmusmobile.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_login.*

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

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_account -> {
            val intent = Intent(this@MainMenuActivity, AccountActivity::class.java)
            startActivity(intent)
            true
        }

        R.id.action_history -> {
            val intent = Intent(this@MainMenuActivity, HistoryActivity::class.java)
            startActivity(intent)
            true
        }

        R.id.action_settings -> {
            val intent = Intent(this@MainMenuActivity, SettingsActivity::class.java)
            startActivity(intent)
            true
        }

        R.id.action_logout -> {
            //Temporary implementation, only returns to login page
            val intent = Intent(this@MainMenuActivity, LoginActivity::class.java)
            startActivity(intent)
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
