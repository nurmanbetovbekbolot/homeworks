package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Head head1 = new Head("Azamat", "Rasulov", 45, 178, 90);
        Head head2 = new Head("Sultan", "Aktanov", 40, 185, 80);
        Head head3 = new Head("Argen", "Tokonov", 35, 190, 70);
        Head head4 = new Head("Aktan", "Asanov", 60, 165, 50);
        Head head5 = new Head("Talgat", "Sultanov", 36, 155, 60);
        Head[] heads = {head1, head2, head3, head4, head5};
        Region region1 = new Region("At-Bashi", "North", head2, 30000, 15);
        Region region2 = new Region("Sokuluk", "North", head3, 20000, 25);
        Region region3 = new Region("Pervomay", "West", head1, 35000, 35);
        Region region4 = new Region("Manas", "Ost", head4, 60000, 55);
        Region region5 = new Region("Kyzyl-Kiya", "South", head4, 80000, 65);
        Region[] regions1 = {region1, region2};
        Region[] regions2 = {region1, region3};
        Region[] regions3 = {region1, region2, region4, region5};
        Region[] regions = {region1, region2, region3, region4, region5};

        City city1 = new City("Bishkek", "North", head1, 1000000, 300, regions3, true);
        City city2 = new City("Osh", "South", head2, 800000, 200, regions2, false);
        City city3 = new City("Talas", "North", head3, 250000, 100, regions1, false);
        City[] cities={city1,city2,city3};
        Village village1 = new Village("Maksat", "west", head4, 3000, 10, 3);
        Village village2 = new Village("Kolmo", "west", head5, 4000, 13, 4);
        Locality[] localities={region1, region2, region3, region4, region5,city1,city2,city3,village1,village2};
        //System.out.println(findByHead("Sultan",regions));
       // System.out.println(findByHead("Sultan",cities));
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(findByHead(a,localities));
    }
    public static String findByHead(String head, Locality[] locality){

            for (int i = 0; i < locality.length; i++) {
               String head_l;
                Locality locality1 = locality[i];
                head_l = locality1.getHead().getName() ;
                if (head_l.equals(head)){
            return locality1.toString();
                }
            }
            return null;
    }

}