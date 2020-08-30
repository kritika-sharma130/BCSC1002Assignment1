/*  Created by IntelliJ IDEA.
 *  User: Kritika Sharma
 *  Date: 28/08/20
 *  Time: 6:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String nameOfStudent;
    private long universityRollNumberOfStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] namesOfBooksIssued;

    public Student() {
        this.nameOfStudent = "Kritika Sharma";
        this.universityRollNumberOfStudent = 191500411L;
        this.numberOfBooksIssuedByStudent = 1;
        this.namesOfBooksIssued = new Book[1];
        for (int i = 0; i < namesOfBooksIssued.length; i++) {
            namesOfBooksIssued[i] = new Book();
        }
    }

    public Student(String nameOfStudent, long universityRollNumberOfStudent, int numberOfBooksIssuedByStudent, Book[] namesOfBooksIssued) {
        this.nameOfStudent = nameOfStudent;
        this.universityRollNumberOfStudent = universityRollNumberOfStudent;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public long getUniversityRollNumberOfStudent() {
        return universityRollNumberOfStudent;
    }

    public void setUniversityRollNumberOfStudent(long universityRollNumberOfStudent) {
        this.universityRollNumberOfStudent = universityRollNumberOfStudent;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getNamesOfBooksIssued() {
        return namesOfBooksIssued.clone();
    }

    public void setNamesOfBooksIssued(Book[] namesOfBooksIssued) {
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", universityRollNumberOfStudent=" + universityRollNumberOfStudent +
                ", numberOfBooksIssuedByStudent=" + numberOfBooksIssuedByStudent +
                ", namesOfBooksIssued=" + Arrays.toString(namesOfBooksIssued) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumberOfStudent() == student.getUniversityRollNumberOfStudent() &&
                getNumberOfBooksIssuedByStudent() == student.getNumberOfBooksIssuedByStudent() &&
                Objects.equals(getNameOfStudent(), student.getNameOfStudent()) &&
                Arrays.equals(getNamesOfBooksIssued(), student.getNamesOfBooksIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNameOfStudent(), getUniversityRollNumberOfStudent(), getNumberOfBooksIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getNamesOfBooksIssued());
        return result;
    }

    /**
     * This method will allow the student to issue a book from the library.
     *
     * @param bookName:This is the name of the book that the student has issued.
     */
    public void issueABook(String bookName) {
        System.out.println("Thank u for issuing the book" + bookName + ".");
    }

    /**
     * This method will allow the student to return a book from the library.
     *
     * @param bookName:This is the name of the book that the student has returned.
     */
    public void returnABook(String bookName) {
        System.out.println("Thank u for returning the book" + bookName + ".");
    }

    /**
     * This method will print the list of all the books issued
     */
    public void listIssuedBooks() {
        for (Book book : namesOfBooksIssued) {
            System.out.println(book);
        }
    }
}
