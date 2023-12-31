package com.giuliana.evaluacioncontinuacuatro.view.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.giuliana.evaluacioncontinuacuatro.R
import com.giuliana.evaluacioncontinuacuatro.databinding.ItemRickimortilistBinding
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti

class RVRickiMortiListAdapter(var results: List<Rickimorti>, var onClick:(Rickimorti) -> Unit): RecyclerView.Adapter<RickiMortiVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickiMortiVH {
        val binding = ItemRickimortilistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RickiMortiVH(binding, onClick)
    }

    override fun getItemCount(): Int = results.size

    override fun onBindViewHolder(holder: RickiMortiVH, position: Int) {
        holder.bind(results.run { get(position) })
    }
}

class RickiMortiVH(private val binding: ItemRickimortilistBinding, val onClick: (Rickimorti) -> Unit): RecyclerView.ViewHolder(binding.root) {
    fun bind(results: Rickimorti) {
        Glide.with(binding.root.context)
            .load(results.image)
            .placeholder(R.drawable.ic_list)
            .error(R.drawable.ic_list)
            .into(binding.imagenView)
        binding.name.text = results.name
        binding.species.text=results.species
        binding.root.setOnClickListener{
            onClick(results)
        }
    }
}