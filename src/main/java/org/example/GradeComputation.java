package org.example;

public class GradeComputation {
    private final double [] scores;

    public GradeComputation(double[] grades) {
        this.scores = grades;
    }

    public double getAverage(){
        double totalAverage = 0;
        for(double grade: scores){
            totalAverage+= grade;
        }
        return  totalAverage/scores.length;
    }


    public  double getMaxGrade(){
        double maxGrade =0;

        for (double grade : scores){
            maxGrade = Math.max(maxGrade, grade);
        }

        return  maxGrade;
    }

    public double getMinGrade(){
        double minGrade = scores[0];


        for (double grade : scores){
            minGrade = Math.min(minGrade, grade);
        }

        return  minGrade;
    }

}
