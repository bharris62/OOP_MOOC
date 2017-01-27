

import java.util.ArrayList;
/**
 * Created by BHarris on 1/27/17.
 */
public class GradeDistribution {
    private ArrayList<String> gradeDistribution;
    private ArrayList<Integer> grades;

    public GradeDistribution() {
        this.grades = new ArrayList<>();
        this.gradeDistribution = new ArrayList<>();
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
                gradeDistribution.add(0,"*");
            } else if (grade < 35) {
                gradeDistribution.add(1,"*");
            } else if (grade < 40) {
                gradeDistribution.add(2,"*");
            } else if (grade < 45) {
                gradeDistribution.add(3,"*");
            } else if (grade < 50) {
                gradeDistribution.add(4,"*");
            } else if (grade < 61) {
                gradeDistribution.add(5,"*");
            }
        }
    }

    public void printGradeStars(){
        int count = 0;
        for(String dist : this.gradeDistribution) {
            System.out.println(dist);
            count++;
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
