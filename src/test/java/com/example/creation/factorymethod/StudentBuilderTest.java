package com.example.creation.factorymethod;

import com.example.creation.builder.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mahdi Sharifi
 * @since 9/22/22
 */
class StudentBuilderTest {

    @Test
    void test(){
        Student student =Student.builder().name("Mahdi").age(20).score(10).build();

        Assertions.assertEquals("Mahdi",student.getName());
        Assertions.assertEquals(20,student.getAge());
        Assertions.assertEquals(10,student.getScore());
    }
}
