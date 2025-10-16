package com.seaford.simplepersistenceservice

import com.seaford.simplepersistenceservice.service.SongService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class SongController(val songService: SongService) {

    @PostMapping("/songs")
    fun saveSong(@RequestBody song: Song): Song {
        return songService.saveSang(song)
    }
}