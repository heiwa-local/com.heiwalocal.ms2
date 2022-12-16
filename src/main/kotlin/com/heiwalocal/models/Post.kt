package com.heiwalocal.models

import kotlinx.serialization.Serializable

val postsStorage = mutableListOf<Post>(
    Post("1","First in the air","pamagiti", "Vadim"),
    Post("2","First in the water","pamagiti oxhen proshy", "Vadim")
)

@Serializable
data class Post(
    val id: String,
    val title: String,
    val body: String,
    val owner: String
)