package com.example.prototypeonkor

import android.icu.text.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProtocolAdapter(private val protocols: List<ProtocolFile>) :
    RecyclerView.Adapter<ProtocolAdapter.ProtocolViewHolder>() {

    class ProtocolViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val doctorNameTextView: TextView = itemView.findViewById(R.id.doctorNameTextView)
        val dateTextView: TextView = itemView.findViewById(R.id.dateTextView)
        val timeTextView: TextView = itemView.findViewById(R.id.timeTextView)
        val lpuTextView: TextView = itemView.findViewById(R.id.lpuTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProtocolViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.protocol_item, parent, false)
        return ProtocolViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProtocolViewHolder, position: Int) {
        val protocol = protocols[position]
        holder.doctorNameTextView.text = protocol.info.doctorName
        holder.dateTextView.text = protocol.info.date
        holder.timeTextView.text = protocol.info.time
        holder.lpuTextView.text = protocol.info.lpu
    }

    override fun getItemCount(): Int {
        return protocols.size
    }
}