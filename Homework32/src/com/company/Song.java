package com.company;

import java.io.FileWriter;

public class Song {
    String title;
    String singer;
    String text;
    String genre;
    public Song(){

    }

    public Song(String title, String singer, String text, String genre) {
        this.title = title;
        this.singer = singer;
        this.text = text;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return  title + "\n" +
                genre+"\n"+
                 singer + "\n" +
                 text+"\n";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
