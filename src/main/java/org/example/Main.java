package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person(1123, "Alaa Alsumaeel", 28, "Doctor");
        PersonsList.writePersonToFile(person1);

    }
}