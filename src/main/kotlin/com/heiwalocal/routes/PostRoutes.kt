package com.heiwalocal.routes

import com.heiwalocal.models.postsStorage
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.postRouting() {
    route("/posts") {
        get {
            if (postsStorage.isNotEmpty()) {
                call.respond(hashMapOf("posts" to postsStorage))
            } else {
                call.respondText("No posts found", status = HttpStatusCode.OK)
            }
        }
    }
}