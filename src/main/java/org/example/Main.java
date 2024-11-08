package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Receive input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of Student:");
        if(!scanner.hasNextInt()) System.out.println("Invalid integer restart the Application!");
        int numberOfStudents = scanner.nextInt();

        double [] studentScores = new double[numberOfStudents];

        userScoreInput(studentScores);

        //Compute on user Grade
        GradeComputation gradeComputation = new GradeComputation(studentScores);
        System.out.println("The maximum score is:" + gradeComputation.getMaxGrade());
        System.out.println("The minimum score is:" + gradeComputation.getMinGrade());
        System.out.println("The average score is:" + gradeComputation.getAverage());

        //Chart
        BarChat barChat = new BarChat(studentScores);
        barChat.getGraph();
    }

    public static void userScoreInput(double [] studentScores){
        for(int i = 0; i<studentScores.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student " + (i+1) + " score: ");

            double studentGrade = scanner.nextDouble();

            studentScores[i] = studentGrade;
        }
    }
}