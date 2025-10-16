package com.seaford.simplepersistenceservice.service

import com.seaford.simplepersistenceservice.Song
import com.seaford.simplepersistenceservice.SongRepository
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.stereotype.Service

@Service
class SongService(val songRepository: SongRepository) {

    private val logger = KotlinLogging.logger {}

    fun saveSang(song: Song): Song {
        logger.info { "Saving song: $song" }
        return songRepository.save(song)
    }
}