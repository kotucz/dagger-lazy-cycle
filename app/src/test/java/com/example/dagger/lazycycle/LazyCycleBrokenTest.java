package com.example.dagger.lazycycle;

import junit.framework.TestCase;

public class LazyCycleBrokenTest extends TestCase {
    public void testDaggerLazyCycle() throws Exception {
        LazyCycleBroken.MyComponent component = DaggerLazyCycleBroken_MyComponent.create();
        final Object bar = component.app().bar.lazyFoo.get().bar;
        assertEquals(LazyCycleBroken.Bar.class, bar.getClass());
    }
}