package dev.matheus.$05_Tipos_de_Dados;

public class BankAccount {
    private static long nextAccountNumber = 1000;
    private long accountNumber; //numero da conta
    private String accountHolder; //nome do titular da conta
    private double balance; //saldo da conta

    public BankAccount(String accountHolder) {
        this.accountNumber = nextAccountNumber++;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }


    public void deposit(double amount) {
        if (amount > 0) { //valor
            balance += amount; // saldo, valor
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { //valor, saldo
            balance -= amount; // saldo, valor
        }
    }

    public static long getNextAccountNumber() {
        return nextAccountNumber;
    }

    public static void setNextAccountNumber(long nextAccountNumber) {
        BankAccount.nextAccountNumber = nextAccountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Matheus");

        System.out.println("Número da conta: " + account1.getAccountNumber());
        System.out.println("Nome do titular: " + account1.getAccountHolder());
        System.out.println("Saldo inicial: " + account1.getBalance());
        System.out.print("Saldo atual: ");
        account1.deposit(1000);
        System.out.println("" +
                "\nDepósito de " + account1.getBalance());
        System.out.println(account1.getBalance());

        account1.withdraw(500);
        System.out.println("Saque de " + account1.getBalance());
        System.out.println(account1.getBalance());
    }
}
