package com.example.recyclerviewexamplo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexamplo.R
import com.example.recyclerviewexamplo.Personajes

class ZeldaAdapter(
    private val superheroList:List<Personajes>,
    private val onClickListener:(Personajes) -> Unit,
    private val onClickDelete:(Int) -> Unit
) : RecyclerView.Adapter<SuperHeroViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_zelda, parent, false))
    }

    override fun getItemCount(): Int = superheroList.size

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superheroList[position]
        holder.render(item, onClickListener, onClickDelete)
    }
}