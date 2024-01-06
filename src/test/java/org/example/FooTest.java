package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    void getName() {
        Foo foo = new Foo("bar", 10);
        assertEquals(foo.getName(), "bar");

    }

    @Test
    void setName() {
        Foo foo = new Foo("bar", 10);
        foo.setName("baz");
        assertEquals(foo.getName(), "baz");
    }

    @Test
    void getHp() {
        Foo foo = new Foo("bar", 10);
        assertEquals(foo.getHp(), 10);
    }

    @Test
    void setHp() {
        Foo foo = new Foo("bar", 10);
        foo.setHp(20);
        assertEquals(foo.getHp(), 20);
    }
}