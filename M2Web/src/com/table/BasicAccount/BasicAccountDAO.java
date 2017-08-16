package com.table.BasicAccount;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.Hibernate.HibernateUtil;

public class BasicAccountDAO extends HibernateUtil<BasicAccount> {

	// public String login(Account loginAccount) {
	// Session sess = null;
	// String account = "";
	// try {
	// sess = HibernateUtil.getSessionFactory().openSession();
	// Criteria criteria = sess.createCriteria(loginAccount.getClass());
	// Iterator iterator = criteria.list().iterator();
	// while (iterator.hasNext()) {
	// // arraylist.add((T) iterator.next());
	// }
	// } catch (HibernateException e) {
	// throw new RuntimeException(e);
	// } finally {
	// sess.close();
	// }
	// return account;
	// }

	public String login(String loginAccount, String password) {
		Session session = null;
		String msg = "";
		BasicAccount checkAccount = new BasicAccount();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(BasicAccount.class);
			if (loginAccount != null && !loginAccount.equals("")) {
				criteria.add(Restrictions.eq("name", loginAccount));
				List list = criteria.list();
				if (list.size() <= 0) {
					msg = "查無此帳號";
				} else {
					checkAccount = (BasicAccount) list.get(0);
					if (checkAccount.getPassword().equals(password)) {
						msg = "登入成功";
					} else {
						msg = "密碼錯誤";
					}
				}
			} else {
				msg = "帳號不可為空";
			}
		} catch (HibernateException e) {
			msg = "發生錯誤 : " + new RuntimeException(e).toString();
			// throw new RuntimeException(e);
		} finally {
			session.close();
		}
		return msg;
	}

	public boolean checkAccount(String createAccount) {
		Session session = null;
		boolean checkRepeated = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Criteria cr = session.createCriteria(BasicAccount.class); // 按类名查询
			Criterion cn = Restrictions.eq("name", createAccount); // 每个Criterion对象表示一个查询条件
			cr.add(cn); // 增加条件
			if (cr.list().size() > 0) {// 查询的结果是已经封装好的
				checkRepeated = true;
			}
		} catch (HibernateException e) {
			throw new RuntimeException(e);
		} finally {
			session.close();
		}
		return checkRepeated;
	}

	/*
	 * 1. DetachedCriteria
	 * criteria=DetachedCriteria.forClass(ObjectEntity.class);
	 * 
	 * criteria.add(Restrictions.eq("propertyName", propertyValue));
	 * 
	 * List result=getHibernateTemplate().findByCriteria(criteria);
	 * 
	 * 
	 * 2. String hql = “from Street”;
	 * 
	 * Query query = session.createQuery(hql);
	 * 
	 * List<Street> list = query.list(); *
	 */

}
