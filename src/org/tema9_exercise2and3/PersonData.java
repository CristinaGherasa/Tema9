package org.tema9_exercise2and3;

import java.time.LocalDate;
import java.time.Period;

public class PersonData {
    private Person person;

    public PersonData(Person person) {
        this.person = person;
    }

    public String getFullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = person.getBirthday();
        Period period = Period.between(birthday, currentDate);
        return period.getYears();
    }
}
