package com.heiwalocal.plugins

import com.heiwalocal.routes.postRouting
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        postRouting()
    }
}
