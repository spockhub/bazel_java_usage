package com.soonpan.bazeljunit4;

import org.junit.Test;

/**
 * @author spock
 */
public class GreatTest {
    @Test
    public void testMain() {
        Great great = new Great();
        great.sayGreat();
        great.sayGreat();
    }
}
