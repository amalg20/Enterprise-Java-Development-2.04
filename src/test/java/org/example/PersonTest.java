package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void setAge_throwsErrorIfAgeLessThan0() {
        Person person1 = new Person(1123, "Alaa Alsumaeel", 28, "Doctor");
        Person person2 = new Person(1421, "Nuha Alansari", 22, "Programmer");
        assertThrows(IllegalArgumentException.class, () -> person1.setAge(-1));
    }
}