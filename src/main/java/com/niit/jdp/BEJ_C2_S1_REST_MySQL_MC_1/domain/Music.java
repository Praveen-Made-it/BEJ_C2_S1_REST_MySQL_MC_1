/*
 *Author Name:Praveen Kumar
 *Date: 23-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S1_REST_MySQL_MC_1.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music {
    @Id
    private int trackId;
    private String trackName;
    private String trackComments;
    private int trackRating;
    private String trackArtist;

    public Music() {
    }

    public Music(int trackId, String trackName, String trackComments, int trackRating, String trackArtist) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComments = trackComments;
        this.trackRating = trackRating;
        this.trackArtist = trackArtist;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }

    public int getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(int trackRating) {
        this.trackRating = trackRating;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    @Override
    public String toString() {
        return "Music{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackComments='" + trackComments + '\'' +
                ", trackRating=" + trackRating +
                ", trackArtist='" + trackArtist + '\'' +
                '}';
    }
}

