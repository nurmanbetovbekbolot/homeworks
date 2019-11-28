package com.company;

public class Loan {
    int id;
    long amount;
    double period;
    double interestRate;
    static int count=0;
    static long count2=0;
    static double countavg=0;
    public Loan(int id, int amount, double period, double interestRate) {
        this.id = id;
        setAmount(this.amount);
        this.period = period;
        this.interestRate = interestRate;
        count++;
        count2=count2+amount;
        countavg=count2/count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        if(amount<0){
            return;}
        else
        {
        this.amount = amount;}
    }

    public double getPeriod() {
        return period;
    }

    public void setPeriod(double period) {
        this.period = period;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
