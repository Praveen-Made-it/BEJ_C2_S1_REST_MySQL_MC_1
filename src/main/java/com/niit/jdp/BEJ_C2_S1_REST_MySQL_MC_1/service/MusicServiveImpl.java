/*
 *Author Name:Praveen Kumar
 *Date: 23-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S1_REST_MySQL_MC_1.service;

import com.niit.jdp.BEJ_C2_S1_REST_MySQL_MC_1.domain.Music;
import com.niit.jdp.BEJ_C2_S1_REST_MySQL_MC_1.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiveImpl implements IMusicService {

    MusicRepository musicRepository;

    @Autowired
    public MusicServiveImpl(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public Music saveMusic(Music music) {
        return musicRepository.save(music);
    }

    @Override
    public boolean deleteMusic(int trackId) {
        musicRepository.deleteById(trackId);
        return true;
    }

    @Override
    public List<Music> fetchAllMusic() {
        return (List<Music>) musicRepository.findAll();
    }
}
