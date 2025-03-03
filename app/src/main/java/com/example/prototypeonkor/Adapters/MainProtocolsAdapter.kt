package com.example.prototypeonkor.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prototypeonkor.MainFragment
import com.example.prototypeonkor.ProtocolFile
import com.example.prototypeonkor.R

class MainProtocolsAdapter(private val protocols: List<ProtocolFile>) : RecyclerView.Adapter<MainProtocolsAdapter.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_protocol_items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (protocols.isEmpty()) return

        val index = if (protocols.size >= 3) protocols.size - 3 + position else position
        holder.textView.text = protocols[index].fileName
    }

    override fun getItemCount(): Int {
        return Math.min(3, protocols.size)
    }

}