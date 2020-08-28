/*  Created by IntelliJ IDEA.
 *  User: Kritika Sharma
 *  Date: 28/08/2020
 *  Time: 6:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfBook;
    private String authorOfBook;
    private String ISBNNumber;

    public Book() {
        this.nameOfBook = "Head First Design Patterns";
        this.authorOfBook = "Elisabeth Freeman";
        this.ISBNNumber = "9780596007126";
    }

    public Book(String nameOfBook, String authorOfBook, String ISBNNumber) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
        this.ISBNNumber = ISBNNumber;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", authorOfBook='" + authorOfBook + '\'' +
                ", ISBNNumber='" + ISBNNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getNameOfBook(), book.getNameOfBook()) &&
                Objects.equals(getAuthorOfBook(), book.getAuthorOfBook()) &&
                Objects.equals(getISBNNumber(), book.getISBNNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBook(), getAuthorOfBook(), getISBNNumber());
    }
}
