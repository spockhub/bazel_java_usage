package com.soonpan.bazeljunit5;



import junit5.src.main.java.com.soonpan.bazeljunit5.Hello5;
import org.junit.jupiter.api.Test;


/**
 * @author spock
 */
public class Hello5Test {
    @Test
    public void testMain() {
        Hello5 hello5 = new Hello5();
        hello5.sayHello();
    }
}
