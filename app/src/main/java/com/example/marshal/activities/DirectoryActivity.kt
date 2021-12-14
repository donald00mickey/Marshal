package com.example.marshal.activities

import android.app.DownloadManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.marshal.R

class DirectoryActivity : AppCompatActivity() {
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_directory)
        button = findViewById(R.id.button2)
        button.setOnClickListener{
            val url = "https://www.buds.com.ua/images/Lorem_ipsum.pdf"
            val request = DownloadManager.Request(Uri.parse(url))
                .setTitle("File")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)

            val dm = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            dm.enqueue(request)
        }
    }
}