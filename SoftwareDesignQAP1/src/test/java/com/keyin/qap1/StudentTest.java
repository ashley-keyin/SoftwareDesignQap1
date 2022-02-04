package com.keyin.qap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void itShouldReturnEmail() {
        String lastName = "Mercer";
        String firstName = "Ashley";
        String email = "amercer87@hotmail.com";
        Student s1 = new Student();
        assertNotNull(email, s1.getEmail());

    }

    @Test
    void itShouldReturnFirstName() {
        String firstName = "Ashley";
        Student s1 = new Student();
        s1.setFirstName(firstName);
        assertEquals("Ashley", s1.getFirstName());

    }

    @Test
    void itShouldReturnLastName() {
        String lastName = "Mercer";
        Student s1 = new Student();
        s1.setLastName(lastName);
        assertEquals("Mercer", s1.getLastName());

    }

    @Test
    void testToString() {
        Student s1 = new Student();
        s1.setStudent("Mercer", "Ashley", "amercer87@hotmail.com");
        String expectedString = "Student's name is Ashley Mercer and has email = amercer87@hotmail.com";
        assertEquals(expectedString, s1.toString());

        }
    }



