package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("song.txt");
        Scanner sc = new Scanner(fileReader);
        Song song=new Song();

        String lyrics= "";
        for (int i = 1; sc.hasNextLine() ; i++) {
            String line=sc.nextLine();
            if (i==1){
            song.setTitle(line);}

            else if (i==2){
                song.setGenre(line);}

            else if (i==3){
                song.setSinger(line);}
            else {
                lyrics = lyrics +"\n"+ line;

            }
        }
        song.setText(lyrics);
        System.out.println(song);
        FileWriter fileWriter2 = new FileWriter("danceMonkey.txt");
        fileWriter2.write(song.getTitle()+"\n");
        fileWriter2.write(song.getGenre()+"\n");
        fileWriter2.write(song.getSinger()+"\n");
        fileWriter2.write(song.getText());
        fileReader.close();
        fileWriter2.close();

    }
}
