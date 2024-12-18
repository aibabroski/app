package com.todo.service

import com.todo.models.Task

object TaskService{
    private val tasks = mutableListOf<Task>()

    fun getAllTasks(): List<Task> = tasks
}