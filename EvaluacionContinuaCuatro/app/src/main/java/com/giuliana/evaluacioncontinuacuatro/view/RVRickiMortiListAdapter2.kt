package com.giuliana.evaluacioncontinuacuatro.view.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.giuliana.evaluacioncontinuacuatro.R
import com.giuliana.evaluacioncontinuacuatro.databinding.ItemRickimortifavoriteBinding
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti
import com.giuliana.evaluacioncontinuacuatro.model.RickimortiFirebase

class RVRickiMortiListAdapter2(private val dataList: List<RickimortiFirebase>) :
    RecyclerView.Adapter<RVRickiMortiListAdapter2.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.name)
        val statusTextView: TextView = itemView.findViewById(R.id.status)
        val genderTextView: TextView=itemView.findViewById(R.id.gender)
        val speciesTextView: TextView=itemView.findViewById(R.id.species)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rickimortifavorite, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.nameTextView.text = currentItem.name
        holder.statusTextView.text = currentItem.status
        holder.genderTextView.text = currentItem.gender
        holder.speciesTextView.text = currentItem.species
    }

    override fun getItemCount(): Int = dataList.size
}