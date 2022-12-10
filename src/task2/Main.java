package task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        String name;
        String position;
        int year;
        final int nowYear = 2022;
        final int startYear = 1970;
        int experience;
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Enter " + i + " worker's name: ");
            name = sc.nextLine();
            System.out.println("Enter worker's position: ");
            position = sc.nextLine();
            System.out.println("Enter year of acceptance: ");
            year = sc1.nextInt();
            if (year < startYear || year > nowYear) {
                throw new RuntimeException("year is out of bound!");
            }

            workers[i] = new Worker(name, position, year);
            System.out.println(workers[i].toString());
        }
//        Arrays.sort(workers);


        for (int i = 0; i < workers.length; i++) {
            System.out.println("Name: " + workers[i].name +
                    ", Position: " + workers[i].position + ", Year of acceptance: " + workers[i].year);

        }

        Arrays.sort(workers, Comparator.comparing(Worker::getName));
        System.out.println("-----------------");

        for (int i = 0; i < workers.length; i++) {
            System.out.println("Name: " + workers[i].name +
                    ", Position: " + workers[i].position + ", Year of acceptance: " + workers[i].year);

        }
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Enter experience: ");
        experience = sc1.nextInt();

        for (int i = 0; i < workers.length; i++) {
            if (nowYear - workers[i].getYear() > experience) {
                System.out.println("Name: " + workers[i].name +
                        ", Position: " + workers[i].position + ", Year of acceptance: " + workers[i].year);
            }


        }


    }


}
