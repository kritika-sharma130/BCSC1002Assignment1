/*  Created by IntelliJ IDEA.
 *  User: Kritika Sharma
 *  Date: 28/08/20
 *  Time: 6:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_BOOK = 1;
    private static final int RETURN_A_PREVIOUSLY_ISSUED_BOOK = 2;
    private static final int SHOW_ALL_THE_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
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
                    break;
                case RETURN_A_PREVIOUSLY_ISSUED_BOOK:
                    break;
                case SHOW_ALL_THE_ISSUED_BOOKS:
                    break;
                default:
                    break;
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}
