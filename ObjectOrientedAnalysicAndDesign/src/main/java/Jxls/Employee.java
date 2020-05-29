package Jxls;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    private String name;
    private Date birthDate;
    private BigDecimal payment;
    private BigDecimal bonus;

    public Employee(String name, Date birthDay, BigDecimal payment, BigDecimal bonus) {
        this.name = name;
        this.birthDate = birthDay;
        this.payment = payment;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDate;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDate = birthDay;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
}
