package org.dfw2gug;

import org.junit.*;
import static org.junit.Assert.*;

public class SimpleTest {
    @Test
    public void testSimple() {
	Simple simple = new Simple("Hello World!");
	assertEquals(simple.toString(), "Hello World!");
    }
    
}
