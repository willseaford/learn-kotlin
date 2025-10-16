package org.example.com.seaford.simplepersistenceservice.controller

import org.example.com.seaford.simplepersistenceservice.domain.Song
import org.example.com.seaford.simplepersistenceservice.service.SongService
import org.springframework.stereotype.Controller

@Controller
class SongController(val songService: SongService) {

    fun saveSong(song: Song): Song {
        return songService.saveSang(song)
    }
}