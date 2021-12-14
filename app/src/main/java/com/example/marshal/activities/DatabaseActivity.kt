package com.example.marshal.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.example.marshal.R

class DatabaseActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    var books = arrayOf<String?>("Book A", "Book B", "Book C")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database)

        //initializing spinner
        val spin = findViewById<Spinner>(R.id.spinner)
        spin.onItemSelectedListener = this
        val ad: ArrayAdapter<*> = ArrayAdapter<Any?>(this, android.R.layout.simple_spinner_item, books) // adding dropdown values
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) //setting dropdown layout
        spin.adapter = ad
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View, position: Int, id: Long) {
        //performing operations on selected item
        Toast.makeText(applicationContext, books[position], Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {}
}