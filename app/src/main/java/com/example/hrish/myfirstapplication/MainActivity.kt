package com.example.hrish.myfirstapplication

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        HmmButton.setOnClickListener {
            d( "Dead_Meme", "Pressed")
            welcomeMessage.text = "YOU PRESSED THE THONK"

        }
    }
}
