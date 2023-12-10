package com.example.mobileappproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

//Steven Drew
//Project
//12/1/2023

class ItemDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_details)

        //set buttons
        val btnBuy = findViewById<Button>(R.id.btnBuy)
        val btnBack = findViewById<ImageButton>(R.id.btnBack2)

        //store values from previous Activity that was passed with Intent
        val title = intent.getStringExtra("title")
        val price = intent.getStringExtra("price")
        val location = intent.getStringExtra("location")
        val description = intent.getStringExtra("description")
        val img = intent.getIntExtra("image", 0)

        //set the text and image views
        val itemTitle = findViewById<TextView>(R.id.txtItemDetailsTitle)
        val itemPrice = findViewById<TextView>(R.id.txtItemDetailsPrice)
        val itemLocation = findViewById<TextView>(R.id.txtItemDetailsLocation)
        val itemDescription = findViewById<TextView>(R.id.txtItemDetailsDesc)
        val itemImg = findViewById<ImageView>(R.id.imgDetailsItem)

        //set the stored values that were passed from the previous Activity into the views
        itemTitle.text = title
        itemPrice.text = price
        itemLocation.text = location
        itemDescription.text = description
        itemImg.setImageResource(img)

        Log.d("ItemDetails", "Resource ID: $img")

        btnBuy.setOnClickListener {
            Toast.makeText(this, "Item purchased",
                Toast.LENGTH_LONG).show()
            finish()
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}