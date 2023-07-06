package org.tema9_exercise2and3;

import java.time.LocalDate;


public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin(String position, LocalDate dateOfEmployment, String firstName, String lastName,
                         LocalDate birthday, String address, String dbTechnology) {
        super(position, dateOfEmployment, firstName, lastName, birthday, address);
        this.dbTechnology = dbTechnology;
    }



    @Override
    public String getAddress() {
        return "db admin " + super.getAddress();
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
}
