package com.example.marshal.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marshal.R
import com.example.marshal.apiexample.CustomAdapter
import com.example.marshal.apiexample.User

class ApiActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api)

        val recyclerView = findViewById(R.id.recycleView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val  users = ArrayList<User>()
        users.add(User("lorem ipsum","Ranchi, India"))
        users.add(User("lorem ipsum","Kanchi, India"))
        users.add(User("lorem ipsum","Ranchi, India"))
        users.add(User("lorem ipsum","Kanchi, India"))
        users.add(User("lorem ipsum","Ranchi, India"))
        users.add(User("lorem ipsum","Kanchi, India"))
        users.add(User("lorem ipsum","Ranchi, India"))
        users.add(User("lorem ipsum","Kanchi, India"))

        val adapter = CustomAdapter(users)
        recyclerView.adapter = adapter
    }
}