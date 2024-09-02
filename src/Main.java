import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // init scanner obj
        // welcome message
        System.out.println("Welcome! ");

        System.out.println("Eneter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        while (password.length() < 8) {
            System.out.println("Error! has to be larger then 8");
        }
        System.out.println("Enter number of student");
        int size = scanner.nextInt(); // enter the size of arrya

        // user enter score and put it in a score array
        int[] score = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter score:");
            score[i] = scanner.nextInt();
        }
       // print out the entir score
        System.out.println("The score are:");
       for (int i = 0; i  <size; i++) {
           System.out.println(score[i]);
       }

       scanner.nextLine();
        // ask user to enter choice and calcualte either mean or sum
        System.out.println("What do you want to do now? Enter mean or sum:");
        String choice = scanner.nextLine();
        if (choice.equals("mean")) {
           int total = 0;

          for (int i = 0; i < size; i++){
              total += score[i];
          }
         double mean = (double) total / size;
            System.out.println("The mean is " + mean);
       } else if (choice.equals("sum")) {
            int total = 0;
            for (int i = 0; i < size; i++){
                total += score[i];
            }
            System.out.println("The sum is: " + total);
        } else {
            System.out.println("Error!");
        }
    }
}