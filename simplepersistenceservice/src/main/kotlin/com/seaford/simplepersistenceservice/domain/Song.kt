package com.seaford.simplepersistenceservice

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.Date

@Entity
data class Song (
    @Id
    val id: Long,
    val title: String,
    val artist: String,
    val album: String,
    val releaseDate: Date
)
