package com.example.epmusmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProgrammeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programme)

        // toolbar support
        setSupportActionBar(findViewById(R.id.my_toolbar_test))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
