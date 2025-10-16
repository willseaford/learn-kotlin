package org.example.com.seaford.simplepersistenceservice.service

import org.example.com.seaford.simplepersistenceservice.domain.Song
import org.example.com.seaford.simplepersistenceservice.repo.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(val songRepository: SongRepository) {

    fun saveSang(song: Song): Song {
        return songRepository.save(song)
    }
}