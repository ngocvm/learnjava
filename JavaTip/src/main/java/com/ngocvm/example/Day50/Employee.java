package com.ngocvm.example.Day50;

import java.util.Date;

public class Employee {
    private String name;
    private GENDER gender;
    private Date birthDay;
    private String phone;
    private String email;
    private String jobPosition;
    private String department;

    public enum GENDER {
        MALE,
        FEMALE,
    }

    public Employee(String name, GENDER gender, Date birthDay, String phone, String email, String jobPosition, String department) {
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.jobPosition = jobPosition;
        this.department = department;
    }

    public Employee(String name, GENDER gender, String jobPosition, String department) {
        this(name, gender, null, "", "", jobPosition, department);
    }

    public Employee(String name, GENDER gender, Date birthDay, String phone) {
        this(name, gender, birthDay, phone, "", "", "");
    }

    public void work() {
        System.out.println("Perform my tasks.");
    }

    public void introduce() {
        System.out.println("My name is " + name + "\n I work as " + jobPosition + " at " + department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
