package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PersonsList {
    private List<Person> person;

    public PersonsList(List<Person> person) {

        this.person = person;
    }

    public List<Person> getPerson() {

        return person;
    }

    public void setPerson(List<Person> person) {

        this.person = person;
    }

    public static Person findByName(List<Person> list, String name) throws IllegalArgumentException {
        if (!name.matches("\\w+ \\w+")) {
            throw new IllegalArgumentException("The name parameter must be in the format \"firstName lastName\"");
        }

        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];
        String fullName = firstName + " " + lastName;


        for (Person person : list) {
            if (fullName.equals(person.getName())) {
                return person;
            }
        }

        throw new IllegalArgumentException("");
    }

    public Person clone(Person person) {
        return new Person(person.getId() + 1, person.getName(), person.getAge(), person.getOccupation());
    }

    public static void writePersonToFile(Person person) throws IllegalArgumentException {
        try (FileWriter fileWriter = new FileWriter("persons.txt", true)) {
            fileWriter.write(person.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}




