package com.example.marshal.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.marshal.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialization
        val apiButton = findViewById<Button>(R.id.apiButton)
        val databaseButton = findViewById<Button>(R.id.databaseButton)
        val directoryButton = findViewById<Button>(R.id.directoryButton)

        //starting another activity


        //onCLick
        apiButton?.setOnClickListener()
        {
            //Opening Api Activity
            val intent = Intent(this, ApiActivity::class.java)
            startActivity(intent)
        }
        databaseButton?.setOnClickListener()
        {
            //Opening Database Activity
            val intent = Intent(this, DatabaseActivity::class.java)
            startActivity(intent)
        }
        directoryButton?.setOnClickListener()
        {
            //Opening Directory Activity
            val intent = Intent(this, DirectoryActivity::class.java)
            startActivity(intent)
        }

    }

}