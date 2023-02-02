package org.LeetCode;
/* 2043. Simple Bank System
 * ou have been tasked with writing a program for a popular bank that will 
 * automate all its incoming transactions (transfer, deposit, and withdraw).
 * The bank has n accounts numbered from 1 to n.
 * The initial balance of each account is stored in a 0-indexed integer array balance,
 * with the (i + 1)th account having an initial balance of balance[i].
 * Execute all the valid transactions. A transaction is valid if:
 * The given account number(s) are between 1 and n, and
 * The amount of money withdrawn or transferred from is less than or equal to the balance of the account.
 * Implement the Bank class:
 * Bank(long[] balance) Initializes the object with the 0-indexed integer array balance.
 * boolean transfer(int account1, int account2, long money) Transfers money dollars from the account numbered account1 to the account numbered account2.
 * Return true if the transaction was successful, false otherwise.
 * boolean deposit(int account, long money) Deposit money dollars into the account numbered account.
 * Return true if the transaction was successful, false otherwise.
 * boolean withdraw(int account, long money) Withdraw money dollars from the account numbered account.
 * Return true if the transaction was successful, false otherwise.
 */
class Bank {
    private long[] accounts;
    private int NoOfAcc;
    Bank(long[] balance) {
      this.accounts = balance;
      this.NoOfAcc = accounts.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1>NoOfAcc || account2>NoOfAcc || accounts[account1-1]<money)
            return false;
        accounts[account1-1]-=money;
        accounts[account2-1]+=money;
        return true;
        
    }
    
    public boolean deposit(int account, long money) {
        if(account>NoOfAcc)
            return false;
        accounts[account-1]+=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account>NoOfAcc || accounts[account-1]<money)
            return false;
        accounts[account-1]-=money;
        return true;
    }
}
public class BankSystemDesign {
    
    public static void main(String[] args) {
      
        long[] accountsWithBalance = {10,100,20,50,30};
        Bank bank = new Bank(accountsWithBalance);
        System.out.println(bank.withdraw(3, 10));
        System.out.println(bank.transfer(5, 1, 20));
        System.out.println(bank.deposit(5, 20));
        System.out.println(bank.transfer(3, 4, 15));
        System.out.println(bank.withdraw(10, 50));
        
    }
}
