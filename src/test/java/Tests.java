import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {


    @Test
    void printTest() {
        String message = "hi";
        System.out.println("hi");

        assertEquals("hi", message);
    }
}