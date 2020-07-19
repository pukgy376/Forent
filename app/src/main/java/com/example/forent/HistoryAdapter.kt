package com.example.forent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryAdapter (val userList: ArrayList<History>) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_history, parent, false)
        return ViewHolder(v)

}

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val record: History = userList[position]
        holder?.textViewDate?.text = record.date
        holder?.textviewOrder?.text = record.order
        holder?.textviewFaculty?.text = record.faculty

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewDate = itemView.findViewById(R.id.showdate) as TextView
        val textviewOrder = itemView.findViewById(R.id.showorder) as TextView
        val textviewFaculty = itemView.findViewById(R.id.showfaculty) as TextView

    }
}