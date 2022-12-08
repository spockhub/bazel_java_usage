package com.soonpan.bazeljunit4;

import org.junit.Test;
/**
 * @author spock
 */
public class HelloTest {
    @Test
    public void testMain() {
        Hello hello = new Hello();
        hello.sayHello();
    }
}
