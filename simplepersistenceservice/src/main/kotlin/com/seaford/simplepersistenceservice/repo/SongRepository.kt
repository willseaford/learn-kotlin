package org.example.com.seaford.simplepersistenceservice.repo

import org.example.com.seaford.simplepersistenceservice.domain.Song
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SongRepository: JpaRepository<Song, Long>