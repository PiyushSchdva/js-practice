import jdk.management.resource.ResourceType;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Future;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        System.out.println(arr[0]);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input your age?");
//        int age = sc.nextInt();
//        System.out.println(age
//        );

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//
//        }
//      int i = 10;
//      while (i > 1){
//          System.out.println(i);
//          i--;
//
//      }
//    int[] numbers = {1,2,3};
//    try {
//        System.out.println(numbers[4]);
//    } catch (Exception e) {
//        System.out.println("error");
//    }
//    public  void sum(int a, int b) {
//        int sum = (a + b);
//        System.out.println(sum);
//    }

//        System.out.println("Hey");
//
//    int randomNumber = (int)(Math.random()*100);
//        System.out.println(randomNumber);
//        Scanner sc = new Scanner(System.in);
//        int userInput;
//
//        do {
//            System.out.println("Guess my number?");
//            userInput = sc.nextInt();
//            if (userInput > randomNumber) {
//                System.out.println("You're guessing larger number.");
//
//
//            } else if (userInput==randomNumber) {
//                System.out.println("Hurray you did it!");
//            }
//            else if (userInput < randomNumber) {
//                System.out.println("You're guessing smaller number.");
//
//            }
//
//        }
//        while (userInput!=randomNumber);{
//            System.out.println("Keep guessing");
//        }


        System.out.println("Best coder is back to code.");
        int[] number = {1, 2, 3, 4};
        int h = 0;
        for (int i = 0; i < number.length; i++) {
            h += number[i];


        }
        System.out.println(h);


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        For each loop
        for (String car : cars) {
            System.out.println(car);
        }

        int[][] multiArray = {{1, 2, 3}, {1, 2, 4}};
        for (int[] multiArr : multiArray) {
            System.out.println(multiArr);


        }
//        String[] arrCheck = {"aman", "Rohit"};
//        void sum ( int a, int b){
//            System.out.println(a + b);
//
//
//            System.out.println( "first array"+"Second array");
//            System.out.println(12);
//        }

        System.out.println("Life starts here with new beginning˳");

    }

}
