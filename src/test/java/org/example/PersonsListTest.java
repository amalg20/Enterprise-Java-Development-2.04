package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonsListTest {

    @Test
    void findByName_returnsthecorrectPersonobject() {
        Person person1 = new Person(1123, "Alaa Alsumaeel", 28, "Doctor");
        Person person2 = new Person(1421, "Nuha Alansari", 22, "Programmer");
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(person1);
        listPerson.add(person2);
        assertEquals(person1, PersonsList.findByName(listPerson, "Alaa Alsumaeel"));
    }

    @Test
    void testClone() {
        Person person1 = new Person(1123, "Alaa Alsumaeel", 28, "Doctor");
        Person person2 = new Person(1787, "Alaa Alsumaeel", 28, "Doctor");
        assertEquals(person1.getName(), person2.getName());
        assertEquals(person1.getAge(), person2.getAge());
        assertEquals(person1.getOccupation(), person2.getOccupation());
        assertNotEquals(person1.getId(), person2.getId());
    }

    @Test
    void findByName_throwsanexception() {
        Person person1 = new Person(1123, "Alaa Alsumaeel", 28, "Doctor");
        Person person2 = new Person(1421, "Nuha Alansari", 22, "Programmer");
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(person1);
        listPerson.add(person2);
        IllegalArgumentException manarAlfarsi = assertThrows(IllegalArgumentException.class, () -> PersonsList.findByName(listPerson, "Manar Alfarsi"));
    }
}