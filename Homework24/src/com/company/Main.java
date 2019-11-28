package com.company;

public class Main {

    public static void main(String[] args) {
	Loan loan1=new Loan(1,20000,3.5,5);
	Loan loan2=new Loan(2,50000,3,7);
	Loan loan3=new Loan(3,70000,2,6);
	Loan loan4=new Loan(4,90000,5,9);
	Loan loan5=new Loan(5,100000,10,13);
		System.out.println(Loan.count);
		System.out.println(Loan.count2);
		System.out.println(Loan.countavg);
    }

}
