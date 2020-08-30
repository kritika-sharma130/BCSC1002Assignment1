/*  Created by IntelliJ IDEA.
 *  User: Kritika Sharma
 *  Date: 28/08/20
 *  Time: 6:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_BOOK = 1;
    private static final int RETURN_A_PREVIOUSLY_ISSUED_BOOK = 2;
    private static final int SHOW_ALL_THE_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long UniversityRollNumber;
        String nameOfStudent;
        String nameOfBookWantToIssue;
        String nameOfBookWantToReturn;
        int studentInput;
        Student student = new Student();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1..4): ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_A_BOOK:
                    System.out.println("Please enter your university roll number");
                    UniversityRollNumber = scanner.nextLong();
                    System.out.println("Please enter your name");
                    scanner.next();
                    nameOfStudent = scanner.nextLine();
                    System.out.println("Please enter the name of the book you want to issue.");
                    nameOfBookWantToIssue = scanner.nextLine();
                    student.issueABook(nameOfBookWantToIssue);
                    break;
                case RETURN_A_PREVIOUSLY_ISSUED_BOOK:
                    System.out.println("Please enter your university roll number");
                    UniversityRollNumber = scanner.nextLong();
                    System.out.println("Please enter your name");
                    scanner.next();
                    nameOfStudent = scanner.nextLine();
                    System.out.println("Please enter the name of the book you want to return");
                    nameOfBookWantToReturn = scanner.nextLine();
                    student.returnABook(nameOfBookWantToReturn);
                    break;
                case SHOW_ALL_THE_ISSUED_BOOKS:
                    System.out.println("Please enter your university roll number");
                    UniversityRollNumber = scanner.nextLong();
                    System.out.println("Please enter your name");
                    scanner.next();
                    nameOfStudent = scanner.nextLine();
                    System.out.println("The names of all the books issued: ");
                    student.listIssuedBooks();
                    break;
                default:
                    break;
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}
