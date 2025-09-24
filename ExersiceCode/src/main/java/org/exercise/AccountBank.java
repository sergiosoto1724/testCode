package org.exercise;
//Write a class AccountBank
//Contain properties: name and balance
//Contain functions: deposit, withdraw, showBalance
public class AccountBank {

    public static class BankAccount{
        public String name;
        public double balance;

        BankAccount(String name, double balance){
            this.name = name;
            this.balance = balance;
        } //constructor

        public void deposit(double amount){
            this.balance += amount;
        }

        public void withdraw(double amount){
            if(this.balance >= amount) {
                this.balance -= amount;
            }
        }
        public void showBalance(){
            System.out.println("Titular:   " + this.name +" \n Balance:   "+ this.balance );
        }

    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Sergio", 1500);
        bank.deposit(500);
        bank.deposit(500);
        bank.withdraw(200);
        bank.showBalance();
    }

}
