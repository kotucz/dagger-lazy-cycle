package com.example.dagger.lazycycle;

import javax.inject.Inject;

import dagger.Component;
import dagger.Lazy;

public class LazyCycleBroken {

    @Component
    public static interface MyComponent {
        App app();
    }

    public static class App {
        @Inject
        Bar bar;

        @Inject
        public App() {
        }
    }

    public static class Bar {
        @Inject
        Lazy<Foo> lazyFoo;//in dagger1 this is legal, in dagger2 cycles of any kind are forbidden

        @Inject
        public Bar() {
        }
    }

    public static class Foo {
        @Inject
        Bar bar;

        @Inject
        public Foo() {
        }
    }
}