package org.example;
import org.testng.annotations.Test;

public class TestCases {

    @Test(priority=1)
    void setup() {
        System.out.printf("i'm inside setup");

    }

    @Test(priority=2)
    void testSteps() {
        System.out.println("i'm inside testSteps");

    }

    @Test(priority=3)
    void tearDown(){
        System.out.println("im inside tearDown");
    }


}
