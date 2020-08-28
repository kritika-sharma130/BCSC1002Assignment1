/*  Created by IntelliJ IDEA.
 *  User: Kritika Sharma
 *  Date: 28/08/20
 *  Time: 6:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] namesOfBooksAvailable;

    public Library() {
        this.namesOfBooksAvailable = new Book[8];
        for (int i = 0; i < namesOfBooksAvailable.length; i++) {
            namesOfBooksAvailable[i] = new Book();
        }
    }

    public Library(Book[] namesOfBooksAvailable) {
        this.namesOfBooksAvailable = namesOfBooksAvailable;
    }

    public Book[] getNamesOfBooksAvailable() {
        return namesOfBooksAvailable.clone();
    }

    public void setNamesOfBooksAvailable(Book[] namesOfBooksAvailable) {
        this.namesOfBooksAvailable = namesOfBooksAvailable;
    }

    @Override
    public String toString() {
        return "Library{" +
                "namesOfBooksAvailable=" + Arrays.toString(namesOfBooksAvailable) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getNamesOfBooksAvailable(), library.getNamesOfBooksAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getNamesOfBooksAvailable());
    }
}
