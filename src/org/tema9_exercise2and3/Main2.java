package org.tema9_exercise2and3;

import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(1990, 5, 15);
        LocalDate dateOfEmployment = LocalDate.of(2021, 3, 1);

        Programmer programmer = new Programmer("Software Engineer", dateOfEmployment,
                "John", "Doe", dateOfBirth, "123 Main St", "Java");
        DatabaseAdmin databaseAdmin = new DatabaseAdmin("Database Administrator", dateOfEmployment,
                "Jane", "Smith", dateOfBirth, "456 Elm St", "MySQL");

        System.out.println("Programmer:");
        System.out.println("Name: " + programmer.getFirstName() + " " + programmer.getLastName());
        System.out.println("Date of birth: " + programmer.getBirthday());
        System.out.println("Date of employment: " + dateOfEmployment);
        System.out.println("Position: " + programmer.getPosition());
        System.out.println("Language: " + programmer.getLanguage());

        System.out.println("\nDatabase Administrator:");
        System.out.println("Name: " + databaseAdmin.getFirstName() + " " + databaseAdmin.getLastName());
        System.out.println("Position: " + databaseAdmin.getPosition());
        System.out.println("Database Technology: " + databaseAdmin.getDbTechnology());
        System.out.println("Address: " + databaseAdmin.getAddress());


        PersonData personData = new PersonData(programmer);
        System.out.println("\nFull Name: " + personData.getFullName());
        System.out.println("Age: " + personData.getAge());

    }
}
