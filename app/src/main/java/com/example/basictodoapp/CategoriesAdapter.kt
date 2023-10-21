package com.example.basictodoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// Permite pintar las listas y mostrarlas
class CategoriesAdapter(private val categories:List<TaskCategory>, private val onItemSelected:(Int) -> Unit):
    RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : CategoriesViewHolder {
        // Crear una vista y montarla para que onBind.. pueda pasarle la información que tienen que pintar
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category,parent,false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position],onItemSelected)
    }
    override fun getItemCount(): Int = categories.size


}