package com.example.mobileappproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

//Steven Drew
//Project
//12/1/2023

class PostItem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_item)

        // set buttons and textview val for image field
        val imgPicBtn = findViewById<ImageButton>(R.id.imgBtn)
        val imgPicTxt = findViewById<TextView>(R.id.imgPicture)
        val btnPost = findViewById<Button>(R.id.btnPost)
        val btnExit = findViewById<ImageButton>(R.id.btnExit)

        //When clicked for image upload it will tell user that a picture has
        //been selected
        imgPicBtn.setOnClickListener {
            imgPicTxt.text = "Picture Button has been selected"
        }

        //Go back to previous activity when X button is clicked
        btnExit.setOnClickListener {
            finish()
        }

        //When the Post Item button is clicked it will check with checkItemFields() if the fields
        //are filled or else tell user to make sure to complete the fields
        btnPost.setOnClickListener {
            if (checkItemFields()) {
                Toast.makeText(this, "Item Posted",
                    Toast.LENGTH_LONG).show()
                finish()
            } else {
                Toast.makeText(this, "Please make sure all fields are completed",
                    Toast.LENGTH_LONG).show()
            }
        }

    }

    //Function to check the fields in the activity are filled by converting them to strings and uses
    //isNotEmpty() in the return statement to return true or false depending on if all the fields
    //are completed or not
    private fun checkItemFields(): Boolean {
        val stringName = findViewById<EditText>(R.id.stringName).text.toString()
        val numPrice = findViewById<EditText>(R.id.numPrice).text.toString()
        val stringLocation = findViewById<EditText>(R.id.stringLocation).text.toString()
        val stringDesc = findViewById<EditText>(R.id.stringDescription).text.toString()
        val imgPicTxt = findViewById<TextView>(R.id.imgPicture).text.toString()
        val selCategory = findViewById<Spinner>(R.id.selCategory).selectedItem.toString()

        return (stringName.isNotEmpty() && numPrice.isNotEmpty() && stringLocation.isNotEmpty()
                && stringDesc.isNotEmpty() && imgPicTxt.isNotEmpty() && selCategory.isNotEmpty())
    }
}