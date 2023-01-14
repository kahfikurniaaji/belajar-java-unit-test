package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;

public class LifecycleTest {

    private String temp;

    @Test
    void testA() {
        LifecycleTest a = new LifecycleTest();
        a.testA();

        LifecycleTest b = new LifecycleTest();
        b.testB();

        temp = "Kahfi";
    }

    @Test
    void testB() {
        System.out.println(temp);
    }
}
