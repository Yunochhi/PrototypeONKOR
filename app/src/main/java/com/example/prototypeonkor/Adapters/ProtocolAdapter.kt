package com.example.prototypeonkor.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prototypeonkor.APIService.ProtocolFile
import com.example.prototypeonkor.R

class ProtocolAdapter(private val protocols: List<ProtocolFile>) :
    RecyclerView.Adapter<ProtocolAdapter.ProtocolViewHolder>() {

    class ProtocolViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dateTextView: TextView = itemView.findViewById(R.id.dateTextView)
        val timeTextView: TextView = itemView.findViewById(R.id.timeTextView)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
<<<<<<< HEAD
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
=======
>>>>>>> 3fef75deb857198c8ca3017fb8ebc511ed69f08d
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProtocolViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.protocol_info, parent, false)
        return ProtocolViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProtocolViewHolder, position: Int) {
        val protocol = protocols[position]
        holder.dateTextView.text = protocol.info.date
        holder.timeTextView.text = protocol.info.time
        holder.titleTextView.text = protocol.info.lpu
<<<<<<< HEAD
        holder.nameTextView.text = protocol.fileName
=======
>>>>>>> 3fef75deb857198c8ca3017fb8ebc511ed69f08d
    }

    override fun getItemCount(): Int {
        return protocols.size
    }
}