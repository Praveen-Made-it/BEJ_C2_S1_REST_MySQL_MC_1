package com.niit.jdp.BEJ_C2_S1_REST_MySQL_MC_1.service;

import com.niit.jdp.BEJ_C2_S1_REST_MySQL_MC_1.domain.Music;

import java.util.List;

public interface IMusicService {
    Music saveMusic(Music music);

    boolean deleteMusic(int trackId);

    List<Music> fetchAllMusic();
}
