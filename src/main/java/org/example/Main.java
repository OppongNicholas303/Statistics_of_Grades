package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Student:");
        int numberOfStudents = scanner.nextInt();

        double [] studentGrades = new double[numberOfStudents];

        for(int i = 0; i<studentGrades.length; i++){
            System.out.println("Enter student " + (i+1) + " grade: ");

            double studentGrade = scanner.nextDouble();

            studentGrades[i] = studentGrade;

        }

        GradeComputation gradeComputation = new GradeComputation(studentGrades);

//        System.out.println(gradeComputation.getAverage());
//
//        System.out.println(gradeComputation.getMaxGrade());
//        System.out.println(gradeComputation.getMinGrade());

        int [] arrs = {2 ,20 ,21, 22 ,23 ,30, 48, 49, 50, 55, 60 ,65 ,72, 63, 76, 80 ,68, 90, 85, 98
        };
        int [] stats = new int[5];

        for (int arr : arrs) {
            if (arr <= 20) {
                stats[0]++;
            } else if (arr <= 40) {
                stats[1]++;
            } else if (arr <= 60) {
                stats[2]++;
            } else if (arr <= 80) {
                stats[3]++;
            } else {
                stats[4]++;
            }
        }

        System.out.println(Arrays.toString(stats));

        int maxStats = stats[0];
        for(int x : stats){
            maxStats = Math.max(maxStats, x);
        }

        System.out.println(maxStats);


        for (int i= 0; i < maxStats; i++){
            System.out.print(i + "> ");
            for (int stat : stats){
                if(stat > i){
                    System.out.print("#######   ");
                }else {
                    System.out.print("          ");
                }

            }
            System.out.println();
        }




    }
}