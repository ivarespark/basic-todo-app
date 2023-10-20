package com.example.basictodoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TasksAdapter(private val tasks:List<Task>, private val onTaskSelected:(Int) -> Unit): // declaro funcion lambda
    RecyclerView.Adapter<TasksViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task,parent,false)
        return TasksViewHolder(view)
    }

    override fun getItemCount(): Int = tasks.size

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        holder.render(tasks[position])
        holder.itemView.setOnClickListener{
            onTaskSelected(position) // uso funcion lambda, se le asigna funcion lambda a cada uno de los items
        }
    }

}