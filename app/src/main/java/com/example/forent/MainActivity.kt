package com.example.forent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        val record = ArrayList<History>()
        record.add(History("10-02-2020","กลอง","IT"))
        record.add(History("20-02-2020","เตียง","MTA"))

        val adapter = HistoryAdapter(record)
        recyclerView.adapter = adapter
    }
}