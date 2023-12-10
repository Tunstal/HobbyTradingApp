package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

//Steven Drew
//Project
//12/1/2023

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the buttons
        val btnCards = findViewById<Button>(R.id.btnCards)
        val btnMiniatures = findViewById<Button>(R.id.btnMiniatures)
        val btnComics = findViewById<Button>(R.id.btnComics)
        val btnRCKits = findViewById<Button>(R.id.btnRCKits)
        val btnListItem = findViewById<Button>(R.id.btnListItem)

        //set toast message for the buttons that for preview only with no function
        val previewMsg = Toast.makeText(
            this, "Preview Only", Toast.LENGTH_LONG)

        //when buttons are click show toast message for previewMsg
        btnCards.setOnClickListener { previewMsg.show() }
        btnComics.setOnClickListener { previewMsg.show() }
        btnRCKits.setOnClickListener { previewMsg.show() }

        //when btnMiniatures is clicked, start ItemBrowser Activity
        btnMiniatures.setOnClickListener {
            startActivity(Intent(this, ItemBrowser::class.java))
        }

        //when btnListItem is clicked, start PostItem Activity
        btnListItem.setOnClickListener {
            startActivity(Intent(this, PostItem::class.java))
        }
    }
}