package com.movies.movies

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform