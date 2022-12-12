package org.example.lecture14;

@FunctionalInterface
public interface A {
    void doSomeWork(int i);
    static void doSomeStaticWork(int i) {
        //
    }
    default void doSomeDefaultWork() {
        //
    }
}
