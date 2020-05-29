package com.ngocvm.example.Day78.Generic;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    int salary;
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return this.name + " (salary: " + salary + ")";
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
