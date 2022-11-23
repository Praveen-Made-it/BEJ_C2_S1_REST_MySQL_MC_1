/*
 *Author Name:Praveen Kumar
 *Date: 23-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S1_REST_MySQL_MC_1.controller;

import com.niit.jdp.BEJ_C2_S1_REST_MySQL_MC_1.domain.Music;
import com.niit.jdp.BEJ_C2_S1_REST_MySQL_MC_1.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MusicController {

    private IMusicService iMusicService;

    @Autowired
    public MusicController(IMusicService iMusicService) {
        this.iMusicService = iMusicService;
    }

    @PostMapping("/insertmusic")
    public ResponseEntity<?> saveFunction(@RequestBody Music musicobj) {
        return new ResponseEntity<>(iMusicService.saveMusic(musicobj), HttpStatus.CREATED);
    }

    @GetMapping("/fetchallmusic")
    public ResponseEntity<?> fetchFunction() {
        return new ResponseEntity<>(iMusicService.fetchAllMusic(), HttpStatus.OK);
    }

    @DeleteMapping("/deletemusicbyid/{trackId}")
    public ResponseEntity<?> saveFunction(@PathVariable int trackId) {
        iMusicService.deleteMusic(trackId);
        return new ResponseEntity<>("Music Record is deleted", HttpStatus.OK);
    }
}
