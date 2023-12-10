package com.example.mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton

//Steven Drew
//Project
//12/1/2023

class ItemBrowser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_browser)

        //set buttons
        val btnItem1 = findViewById<Button>(R.id.btnItem1)
        val btnItem2 = findViewById<Button>(R.id.btnItem2)
        val btnItem3 = findViewById<Button>(R.id.btnItem3)
        val btnListItem = findViewById<Button>(R.id.btnListItem2)
        val btnBack = findViewById<ImageButton>(R.id.btnBack)

        //When item1 is clicked, set values for strings and image
        btnItem1.setOnClickListener {
            itemDetails(
                getString(R.string.txt_item1Title),
                getString(R.string.txt_item1Price),
                getString(R.string.txt_item1Location),
                getString(R.string.txt_item1Description),
                R.drawable.img_orkmini
            )
        }

        //When item2 is clicked, set values for strings and image
        btnItem2.setOnClickListener {
            itemDetails(
                getString(R.string.txt_item2Title),
                getString(R.string.txt_item2Price),
                getString(R.string.txt_item2Location),
                getString(R.string.txt_item2Description),
                R.drawable.img_soldiermini
            )
        }

        //When item3 is clicked, set values for strings and image
        btnItem3.setOnClickListener {
            itemDetails(
                getString(R.string.txt_item3Title),
                getString(R.string.txt_item3Price),
                getString(R.string.txt_item3Location),
                getString(R.string.txt_item3Description),
                R.drawable.img_dndmini
            )
        }

        //When the list item button is clicked, go to PostItem Activity
        btnListItem.setOnClickListener {
            startActivity(Intent(this, PostItem::class.java))
        }

        //When the back button is clicked, go to previous Activity
        btnBack.setOnClickListener {
            finish()
        }
    }

    //Function that will set the values that will be passed to the ItemDetails Activity to be viewed
    //based on the item button that was clicked and start the Activity
    private fun itemDetails(title: String, price: String, location: String, description: String,
                            img: Int) {
        val i = Intent(this, ItemDetails::class.java).apply {
            putExtra("title", title)
            putExtra("price", price)
            putExtra("location", location)
            putExtra("description", description)
            putExtra("image", img)
        }
        Log.d("ItemDetails", "Resource ID: $img")
        startActivity(i)
    }
}