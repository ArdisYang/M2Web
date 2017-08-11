package com.mainTest;

import com.table.Account.Account;
import com.table.Account.AccountDAO;
import com.table.Personnel.PersonnelDAO;

public class Main {
//http://blog.csdn.net/zdp072/article/details/51137612
	//http://tool.oschina.net/apidocs/apidoc?api=jdk-zh
	//https://dotblogs.com.tw/tomwang/archive/2014/07/12/145916.aspx
	//https://openhome.cc/Gossip/HibernateGossip/
	
	
	public static void main(String[] args) {
		AccountDAO accountDao = new AccountDAO();

		// for (int i = 1; i < 9; i++) {
//		Account account = new Account();
//		account.setId(1);
//		account.setName("TT");// + i);
//		account.setPassword("00");// + i);
		// System.out.println("**********");
//		System.out.println(account.getId());
//		System.out.println(account.getName());
//		System.out.println(account.getPassword()+"*");
//		System.out.println("********");
//		accountDao.update(account);

		System.out.println(accountDao.checkAccount("TT"));
		// }
		
	}

}
