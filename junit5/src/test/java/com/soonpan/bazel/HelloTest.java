package com.soonpan.bazel;

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
