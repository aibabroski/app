package com.todo

import com.todo.service.TaskService
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/tasks"){
            call.respond(TaskService.getAllTasks())
        }
    }
}
