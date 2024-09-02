import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // init scanner obj

        System.out.println("Enter the size of array:");
        int size = scanner.nextInt(); // enter the size of arrya

        int[] score = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter score:");
            score[i] = scanner.nextInt();
        }

        System.out.println("The score are:");
       for (int i = 0; i  <size; i++) {
           System.out.println(score[i]);
       }
    }
}