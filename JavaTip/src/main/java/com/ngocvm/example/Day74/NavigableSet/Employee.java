package com.ngocvm.example.Day74.NavigableSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Employee {
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return new Integer(this.salary);
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name + "-" + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee another = (Employee) obj;
            if (this.name.equals(another.name) && this.salary == another.salary) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + salary;
    }

    public static void main(String[] args) {
        NavigableSet<Employee> setEmployees = new TreeSet<>(new EmployeeComparator());

        setEmployees.add(new Employee("Tom", 80000));
        setEmployees.add(new Employee("Jack", 35000));
        setEmployees.add(new Employee("Jim", 62500));
        setEmployees.add(new Employee("Peter", 58200));
        setEmployees.add(new Employee("Mary", 77000));
        setEmployees.add(new Employee("Jane", 69500));
        setEmployees.add(new Employee("David", 54000));
        setEmployees.add(new Employee("Sam", 82000));

        System.out.println("Employees: " + setEmployees);

        Employee Tom = new Employee("Tom", 80000);
        Employee employee1 = setEmployees.higher(Tom);
        if (employee1 != null) {
            System.out.println("The employee whose salary > Tom: " + employee1);
        }

        Employee emp2 = setEmployees.lower(Tom);
        if (emp2 != null) {
            System.out.println("The employee whose salary < Tom: " + emp2);
        }

        Employee emp3 = setEmployees.ceiling(new Employee(60000));
        if (emp3 != null) {
            System.out.println("The employee whose >= 60000: " + emp3);
        }

        Employee emp4 = setEmployees.floor(new Employee(40000));
        if (emp4 != null) {
            System.out.println("The employee whose <= 40000: " + emp4);
        }

        SortedSet<Employee> highPaidEmployees = setEmployees.tailSet(new Employee(70000));
        System.out.println("High paid employees: " + highPaidEmployees);

        SortedSet<Employee> lowPaidEmployees = setEmployees.headSet(new Employee(60000));
        System.out.println("Low paid employees: " + lowPaidEmployees);

        SortedSet<Employee> goodPaidEmployees = setEmployees.subSet(new Employee(60000), new Employee(70000));
        System.out.println("Good paid employees: " + goodPaidEmployees);
    }
}
