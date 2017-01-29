

import java.util.*;

/**
 * Created by BHarris on 1/27/17.
 */
public class GradeDistribution {
    private String[] gradeDistribution;
    private ArrayList<Integer> grades;

    public GradeDistribution() {
        this.grades = new ArrayList<>();
        this.gradeDistribution = new String[6];
        Arrays.fill(gradeDistribution, "");

    }

    public void addGrades(int grade){
        this.grades.add(grade);
    }

    public void printGrades(){
        for(int grade : this.grades) {
            System.out.println(grade);
        }
    }

    public void distributeGrades(){
        for (int grade : this.grades) {
            if (grade < 30) {
                this.gradeDistribution[0] += "*";
            } else if (grade < 35) {
                this.gradeDistribution[1] += "*";
            } else if (grade < 40) {
                this.gradeDistribution[2] += "*";
            } else if (grade < 45) {
                this.gradeDistribution[3] += "*";
            } else if (grade < 50) {
                this.gradeDistribution[4] += "*";
            } else {
                this.gradeDistribution[5] += "*";
            }
        }

    }

    public void printGradeStars(){
        for (int i = gradeDistribution.length - 1; i >= 0; i--) {
            System.out.println(i + ": "+ gradeDistribution[i]);
        }
    }

    public String acceptancePercentage(){
        double averageGrade = 0;
        double count = 0;
        for(int grade: this.grades) {
            if (grade > 0){
                averageGrade += grade;
                count += 1;
            }
        }

        return String.format("%.3g%n", averageGrade / count);

    }

}
