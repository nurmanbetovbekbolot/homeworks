package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalStateException, IOException {
        FileWriter fileWriter = new FileWriter("file1.txt");
        FileReader fileReader = new FileReader("C:\\Users\\bekbolot\\IdeaProjects\\homeworks\\src\\com\\company\\Main.java");
        Scanner sc = new Scanner(fileReader);
        for (int i = 0;sc.hasNextLine() ; i++) {
            fileWriter.write(sc.nextLine()+"\n");
        }
        fileWriter.close();
        fileReader.close();

        File file= new File("file1.txt");
        try{if(!file.exists())
            throw new FileNotFoundException();
            else if(file.length()>100)
                throw new IllegalStateException("Код слишком большой");
        } catch (IllegalStateException e) {
            e.printStackTrace();
            e.getMessage();
        }
        FileWriter fileWriter1=new FileWriter("file2.txt");
        FileReader fileReader1= new FileReader("file1.txt");
        Scanner sc2=new Scanner(fileReader1);

        for (int i = 0;sc2.hasNextLine(); i++) {
            String line= sc2.nextLine();
            line=line.replaceAll("\\s+","");
            fileWriter1.write(line+"\n");

        }
        fileWriter1.close();
        fileReader1.close();
    }
}
