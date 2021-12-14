package com.example.marshal.apiexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marshal.R

class CustomAdapter ( val userList : ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val usernameTV = itemView.findViewById(R.id.usernameTV) as TextView
        val locationTV = itemView.findViewById(R.id.locationTV) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val users : User = userList[position]
        holder?.usernameTV.text = users.name
        holder?.locationTV.text = users.address
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}
