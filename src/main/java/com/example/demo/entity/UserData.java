package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double montlySalary;
    private double monthlyExpenses;
    private double goalAmount;
    private double monthlySavings;

     @OneToOne
    @JoinColumn(name = "user_id")
    private CUser user;

    public UserData() {
    }

    public UserData(double montlySalary, double monthlyExpenses, double goalAmount,double monthlySavings) {
        this.montlySalary = montlySalary;
        this.monthlyExpenses = monthlyExpenses;
        this.goalAmount = goalAmount;
        this.monthlySavings = monthlySavings;
    }

    public CUser getUser() {
        return user;
    }

    public void setUser(CUser user) {
        this.user = user;
    }

    public void setMonthlySavings(double monthlySavings) {
        this.monthlySavings = monthlySavings;
    }

    public double getMonthlySavings() {
        return monthlySavings;
    }

    public Integer getId() {
        return id;
    }

    public double getMontlySalary() {
        return montlySalary;
    }

    public double getMonthlyExpenses() {
        return monthlyExpenses;
    }   

    public double getGoalAmount() {
        return goalAmount;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMontlySalary(double montlySalary) {
        this.montlySalary = montlySalary;
    }

    public void setMonthlyExpenses(double monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }

    public void setGoalAmount(double goalAmount) {
        this.goalAmount = goalAmount;
    }
    
}
