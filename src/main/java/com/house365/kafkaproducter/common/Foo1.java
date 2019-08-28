package com.house365.kafkaproducter.common;

public class Foo1 {
    private String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public Foo1(String foo) {
        this.foo = foo;
    }

    @Override
    public String toString() {
        return "Foo1{" +
                "foo='" + foo + '\'' +
                '}';
    }
}
