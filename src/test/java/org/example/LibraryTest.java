package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    void newLibraryShouldBeEmpty() {
        Library library = new Library();

        assertTrue(library.getBooks().isEmpty());
    }
}