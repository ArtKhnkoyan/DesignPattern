package com.example.builderpattern;

public class BuilderTest {
    public static void main(String[] args) {
        System.out.println(new SomeClass.Builder()
                .field1(5)
                .field2(5)
                .field3(5)
                .field4("aaa")
                .field5("bbb")
                .build());
    }
}
