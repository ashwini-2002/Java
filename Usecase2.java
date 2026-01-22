//Use Case 2: Student Score Processing System
//📝 Problem Statement
//Create a Java program named StudentScore.java that:
//Accepts 3 command-line arguments:
//Student Name (String)
//Marks in English (int)
//Marks in Maths (int)
// 
//Example:
//java StudentScore Renu 78 92
//Inside the program:
//Calculate total and percentage using arithmetic operators.
//Use comparison operators to determine grade:
//≥ 90 → A
//≥ 75 → B
//≥ 50 → C
//< 50 → Fail
//Store student details in an object:
//•  → practice Garbage Collection concept.
//•  Use a switch keyword for grade calculation (optional).

//Output
//Student: Renu
//English: 78
//Maths: 92
//Total: 170
//Percentage: 85.0%
//Grade: B

package ashwini.cm;

import java.util.Scanner;

    public class Usecase2 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();

        System.out.print("Enter Maths Marks: ");
        int maths = sc.nextInt();

        int total = english + maths;
        float percentage = (total / 200.0f) * 100;

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

      
        System.out.println("\nStudent: " + name);
        System.out.println("English: " + english);
        System.out.println("Maths: " + maths);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

class Students {
    String name;
    int english;
    int maths;

    Students(String name, int english, int maths) {
        this.name = name;
        this.english = english;
        this.maths = maths;
    }

}
