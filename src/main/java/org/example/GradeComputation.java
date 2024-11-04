package org.example;

public class GradeComputation {
    private double [] grades;

    public GradeComputation(double[] grades) {
        this.grades = grades;
    }

    public double getAverage(){
        double totalAverage = 0;
        for(double grade: grades){
            totalAverage+= grade;
        }
        return  totalAverage/2;
    }


    public  double getMaxGrade(){
        double maxGrade =0;

//        for (int i =0; i<Math.ceil(grades.length/2.0); i++){
//            double check = Math.max(grades[i], grades[(grades.length - 1) -i]);
//            maxGrade = check > maxGrade ? check : maxGrade;
//        }

        for (double grade : grades){
            maxGrade = maxGrade > grade ? maxGrade : grade;
        }

        return  maxGrade;
    }

    public double getMinGrade(){
        double minGrade =grades[0];

//        for (int i =0; i<Math.ceil(grades.length/2.0); i++){
//            double check = Math.min(grades[i], grades[(grades.length - 1) -i]);
//            minGrade = check > minGrade ? check : minGrade;
//        }

        for (double grade : grades){
            minGrade = minGrade < grade ? minGrade : grade;
        }

        return  minGrade;
    }

}
