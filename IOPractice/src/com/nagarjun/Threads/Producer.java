package com.nagarjun.Threads;

public class Producer extends Thread{

	 private BankAccount account;
	   public Producer(BankAccount acct) { account = acct; }
	   public void run() {
	      for(int i = 0; i < 5; i++) {
	         account.deposit(10);
	      }
	   }
	
}
