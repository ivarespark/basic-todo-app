package com.example.basictodoapp

data class Task(val name: String, val category: TaskCategory, var isSelected: Boolean =false) {

}