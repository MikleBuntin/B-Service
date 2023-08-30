package org.example;

import java.security.PrivateKey;

public class Person {
    private Integer id;
    private String name;
    private String surname;
    private String family;
    private Integer phone;

    @Override
    public String toString() {
        return "User{" +
                "ID=" + id +
                ", name=" + name + ' ' + surname + ' ' + family +
                '}' + "\n";
    }
}
