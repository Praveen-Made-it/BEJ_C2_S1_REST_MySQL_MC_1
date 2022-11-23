/*
 *Author Name:Praveen Kumar
 *Date: 23-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S1_REST_MySQL_MC_1.repository;

import com.niit.jdp.BEJ_C2_S1_REST_MySQL_MC_1.domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {

}
