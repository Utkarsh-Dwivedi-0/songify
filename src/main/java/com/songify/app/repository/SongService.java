package com.songify.app.repository;


import com.songify.app.model.Song;
import com.songify.app.repository.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService
{
    private final SongRepository songRepository;

    public SongService(SongRepository songRepository)
    {
        this.songRepository = songRepository;
    }

    public List<Song> getAllSongs()
    {
        return songRepository.findAll();
    }

    public Song addSong(Song song)
    {
        return songRepository.save(song);
    }

    public void deleteSong(Long id)
    {
        songRepository.deleteById(id);
    }

    public List<Song> searchByTitle(String title)
    {
        return songRepository.findByTitleContainingIgnoreCase(title);
    }
}

