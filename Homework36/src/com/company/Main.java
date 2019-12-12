package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int min = 0;
        int max = 1;
        int N = 10;
        int[] arr = new int[N];
        System.out.println("Массив:");
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            arr[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(arr[i] + " ");
            list1.add(arr[i]);
            list2.add(arr[i]);
        }
        System.out.println();

        System.out.println("Отсортированный Массив: ");
        sort(arr);
        printArray(arr);

        System.out.println("Отсортированный Arraylist: ");
        sort(list1);
        System.out.println(list1);

        System.out.println("Отсортированный Linkedlist: ");
        sort(list2);
        System.out.println(list2);



    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void sort(int[] arr){
        int N=arr.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void sort(ArrayList<Integer> list1){
        for (int i = 0; i < list1.size() - 1; i++) {
            for (int j = 0; j < list1.size() - i - 1; j++) {
                if (list1.get(j) > list1.get(j + 1)) {
                    int temp = list1.get(j);
                    list1.set(j, list1.get(j + 1));
                    list1.set(j + 1, temp);
                }
            }
        }
    }

    public static void sort(LinkedList<Integer> list2){
        for (int i = 0; i < list2.size() - 1; i++) {
            for (int j = 0; j < list2.size() - i - 1; j++) {
                if (list2.get(j) > list2.get(j + 1)) {
                    int temp = list2.get(j);
                    list2.set(j, list2.get(j + 1));
                    list2.set(j + 1, temp);
                }
            }
        }
    }

}
