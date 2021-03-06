package com.example.epmusmobile.program_fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.epmusmobile.AccountActivity
import com.example.epmusmobile.HistoryActivity
import com.example.epmusmobile.R
import com.example.epmusmobile.SettingsActivity
import com.example.epmusmobile.ui.login.LoginActivity

class ProgramActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program)

        // toolbar support
        setSupportActionBar(findViewById(R.id.my_toolbar_test))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_actions, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_account -> {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
            true
        }

        R.id.action_history -> {
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
            true
        }

        R.id.action_settings -> {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
            true
        }

        R.id.action_logout -> {
            // TODO: handle logout properly
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
