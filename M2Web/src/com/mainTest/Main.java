package com.mainTest;

import com.table.BasicAccount.BasicAccount;
import com.table.BasicAccount.BasicAccountDAO;
import com.table.Personnel.PersonnelDAO;

public class Main {
	// http://blog.csdn.net/zdp072/article/details/51137612
	// http://tool.oschina.net/apidocs/apidoc?api=jdk-zh
	// https://dotblogs.com.tw/tomwang/archive/2014/07/12/145916.aspx
	// https://openhome.cc/Gossip/HibernateGossip/

	// http://programmermagazine.github.io/201407/book/pmag.html

	public static void main(String[] args) {
		// BasicAccountDAO accountDao = new BasicAccountDAO();
		LeoTest leo = new LeoTest();
		LeoTestDAO leoTestDAO = new LeoTestDAO();

//		for (int i = 0; i < 300000; i++) {
//			System.out.println(i);
			leo.setPrice(3002);
			leo.setProduct("產品 : ");
			leoTestDAO.save(leo);
//		}
		System.out.println("完畢");
		// for (int i = 1; i < 9; i++) {
		// Account account = new Account();
		// account.setId(1);
		// account.setName("TT");// + i);
		// account.setPassword("00");// + i);
		// System.out.println("**********");
		// System.out.println(account.getId());
		// System.out.println(account.getName());
		// System.out.println(account.getPassword()+"*");
		// System.out.println("********");
		// accountDao.update(account);

		// System.out.println(accountDao.checkAccount("TT"));
		// }

	}

}
