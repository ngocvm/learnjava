package com.ngocvm.example.Day50;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe",
                Employee.GENDER.MALE,
                null,
                "1234567890",
                "john@company.com",
                "Programmer",
                "Software development");

        Employee employee2 = new Employee("Alice Smith",
                Employee.GENDER.FEMALE,
                null,
                "2468024680",
                "alice@company.com",
                "Designer",
                "Design development");

        Employee employee3 = new Employee("Tim Bucha",
                Employee.GENDER.MALE,
                null,
                "1357913579",
                "tim@company.com",
                "Team Lead",
                "Projects");

        employee1.introduce();
        employee2.introduce();
        employee3.introduce();
    }
}
