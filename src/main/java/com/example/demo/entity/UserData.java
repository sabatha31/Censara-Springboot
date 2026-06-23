package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double montlySalary;
    private double monthlyExpenses;
    private double goalAmount;
    private double monthlySavings;

    public UserData(int id, double montlySalary, double monthlyExpenses, double goalAmount,double monthlySavings) {
        this.id = id;
        this.montlySalary = montlySalary;
        this.monthlyExpenses = monthlyExpenses;
        this.goalAmount = goalAmount;
        this.monthlySavings = monthlySavings;
    }

    public void setMonthlySavings(double monthlySavings) {
        this.monthlySavings = monthlySavings;
    }

    public double getMonthlySavings() {
        return monthlySavings;
    }

    public int getId() {
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

    public void setId(int id) {
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
