import java.util.Arrays;
import java.util.Comparator;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello AEM!");
        int count = 20;
        String name = "Piyush";
        boolean test = true;
        System.out.println(count + name + test);

        try {
            int num = 10 / 0;
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero:" + e);
        }

//      String p = "Piyush";
//        for (int i = 100; i>=1; i--){
//            System.out.println(i);
//        }
/*
        int i= 100;
        while (i>=1){
            i = i-1;
            System.out.println(i+ " While loop running");
        }
  */
        System.out.println("Warming up my java skills");
        System.out.println("let's go man ");
        String[] s = {"name", "Aim", "lame"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        System.out.println("Hi" + " Yes");

        int[] array = {4, 2, 3, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int items : array) {
            System.out.println(items);
        }

        String sys = "hi";
        sys = sys.concat("Yes");
        System.out.println(sys);


        class Employee {
            int id;
            String name;
        }


        class Person extends Employee {
            int age;
        }


        Person per1 = new Person();
        per1.id = 2;
        per1.name = "Sanchit";


        Person per2 = new Person();
        per2.id = 1;
        per2.name = "Rohan";

        Person[] arrayy = {per1, per2};
        Arrays.sort(arrayy, Comparator.comparing((Person p) -> p.id).reversed());
        for (Person p : arrayy) {
            System.out.println(p.id + " " + p.name);
        }


        System.out.println("Hey");

        String[] wordData = {"a", "b", "c", "d"};
        String[] wordNewData = {"a", "b", "f", "d"};

        for (String data : wordData) {
//            return;
        }
        String data2;
        for (String data : wordNewData) {
            data2 = data;
//            return;
        }

        System.out.println("Lets Go!!");
//
        int [] arrayyyy = {1,2,3,4,5};
//        for (int arr: arrayyyy){
//            System.out.println(arr);
//        }
//
//        System.out.println(arrayyyy[0]);

        System.out.println("Coding after ages");

    }


}
