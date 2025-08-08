package week1.day1;

public class Student {
	String studentName;
    int rollNo;
    String collegeName;
    int markScored;
    float cgpa;

public static void main(String[] args) {
    // Creating object for Student class
    Student student = new Student();

    // Assigning values to the variables
    student.studentName = "Arun Kumar";
    student.rollNo = 101;
    student.collegeName = "ABC Engineering College";
    student.markScored = 450;
    student.cgpa = 8.7f;

    // Printing the values
    System.out.println("Student Name: " + student.studentName);
    System.out.println("Roll No: " + student.rollNo);
    System.out.println("College Name: " + student.collegeName);
    System.out.println("Marks Scored: " + student.markScored);
    System.out.println("CGPA: " + student.cgpa);
}
}