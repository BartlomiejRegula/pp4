package pl.regula.ecommerce.hello;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {
    @Test
    void helloTest() {
        //A / Arrange  / Given
        var a = 2;
        var b = 4;
        //A / Act      / When
        var result = a + b;
        //A / Assert   / Then / Expected
        assert 6 == result;
    }

    @Test
    void itFail() {
        //A / Arrange  / Given
        var a = 2;
        var b = 4;
        //A / Act      / When
        var result = a + b;
        //A / Assert   / Then / Expected
        assert 10 == result;
    }

    @Test
    void itGreetUsername() {
        //Arrange
        String name = "Bartek";
        //Act
        String message = String.format("Hello %s", name);
        //Assert
        assertEquals("Hello Bartek", message);
    }

    @Test
    void listExpectedToBeEmpty() {
        var list = new ArrayList<>();

        list.add("Bartek");
        list.remove(0);

        assert list.isEmpty();
    }
}