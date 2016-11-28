package de.codecentric.java8examples.defaultmethods;

import de.codecentric.java8examples.defaultmethods.DefaultGreetingService;
import de.codecentric.java8examples.defaultmethods.DerivedGreetingService;
import de.codecentric.java8examples.defaultmethods.ExtendedGreetingService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test case showing how default methods work.
 */
public class GreetingServiceTest {

    @Test
    public void greetFromDefault() throws Exception {
        assertEquals("Hello World!", new DefaultGreetingService().greet());
    }

    @Test
    public void greetFromExtended() throws Exception {
        assertEquals("Hello Pete!", new ExtendedGreetingService("Pete").greet());
    }

    @Test
    public void greetFromDerived() throws Exception {
        assertEquals("Salut le monde!", new DerivedGreetingService().greet());
    }
}
