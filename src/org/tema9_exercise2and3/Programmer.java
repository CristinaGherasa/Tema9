package org.tema9_exercise2and3;

import java.time.LocalDate;

public class Programmer extends Employee {
    private String language;

    public Programmer(String position, LocalDate dateOfEmployment, String firstName, String lastName,
                      LocalDate birthday, String address, String language) {
        super(position, dateOfEmployment, firstName, lastName, birthday, address);
        this.language = language;
    }

    @Override
    public String getPosition() {
        return "Programmer";
    }

    public String getLanguage() {
        return language;
    }
}
