package com.example.recyclerviewexamplo.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewexamplo.Personajes
import com.example.recyclerviewexamplo.databinding.ItemZeldaBinding

class SuperHeroViewHolder(view:View):RecyclerView.ViewHolder(view){

    val binding = ItemZeldaBinding.bind(view)

    fun render(
        personajesModel: Personajes,
        onClickListener: (Personajes) -> Unit,
        onClickDelete: (Int) -> Unit
    ){
        binding.tvZeldaName.text = personajesModel.superhero
        binding.tvRealName.text = personajesModel.realName
        binding.tvPublisher.text = personajesModel.publisher
        Glide.with(binding.ivZelda.context).load(personajesModel.photo).into(binding.ivZelda)
        itemView.setOnClickListener { onClickListener(personajesModel) }
        binding.btnDelete.setOnClickListener { onClickDelete(adapterPosition) }
    }
}