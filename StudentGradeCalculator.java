package Tasks;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter Number Of Subjects");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        float[] marks= new float[n];
        float total_marks=n*100;

        System.out.println("enter marks out of 100");

        for(int i=0;i<n;i++){
            System.out.print("Subject " + (i+1) + " :");
            
            marks[i]=input.nextFloat();    
       }

      float sum=0;

      for(int i=0;i<n;i++){
       sum=sum+marks[i];
    }

    float avg=sum/n;

    String grade;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

    float percentage=(sum/total_marks)*100;

    System.out.println("You got "+ sum +" marks out of "+ total_marks );
    System.out.println("Your percentage is " + percentage + " %");
    System.out.println("You got " + grade + " Grade");

    }
}
