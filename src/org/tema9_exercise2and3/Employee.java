package org.tema9_exercise2and3;


import java.time.LocalDate;


public class Employee implements Person {
    private String position;
    private LocalDate dateOfEmployment;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String address;

    public Employee(String position, LocalDate dateOfEmployment, String firstName, String lastName,
                    LocalDate birthday, String address) {
        this.position = position;
        this.dateOfEmployment = dateOfEmployment;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
    }
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }
}
