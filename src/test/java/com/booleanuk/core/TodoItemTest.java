package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void checkGetStatusCorrectlyReturnsStatus() {
        TodoItem todo = new TodoItem("Tidy up", "Tidy up the living room", "Incomplete");
        Assertions.assertEquals("Incomplete", todo.getStatus());
    }

    @Test
    public void checkSetStatusCorrectlyModifiesStatus() {
        TodoItem todo = new TodoItem("Tidy up", "Tidy up the living room", "Incomplete");
        todo.setStatus("Complete");
        Assertions.assertEquals("Complete", todo.getStatus());
    }

    @Test
    public void checkGetTitleCorrectlyReturnsTitle() {
        TodoItem todo = new TodoItem("Tidy up", "Tidy up the living room", "Incomplete");
        Assertions.assertEquals("Tidy up", todo.getTitle());
    }

    @Test
    public void checkSetTitleCorrectlyModifiesStatus() {
        TodoItem todo = new TodoItem("Tidy up", "Tidy up the living room", "Incomplete");
        todo.setTitle("Tidy room");
        Assertions.assertEquals("Tidy room", todo.getTitle());
    }

    @Test
    public void checkGetDetailCorrectlyReturnsDetail() {
        TodoItem todo = new TodoItem("Tidy up", "Tidy up the living room", "Incomplete");
        Assertions.assertEquals("Tidy the sitting room", todo.getDetail());
    }

    @Test
    public void checkSetDetailCorrectlyModifiesDetail() {
        TodoItem todo = new TodoItem("Tidy up", "Tidy up the living room", "Incomplete");
        todo.setDetail("TTidy the sitting room");
        Assertions.assertEquals("Tidy the sitting room", todo.getDetail());
    }
}
