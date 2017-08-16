package com.table.Personnel;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.Hibernate.HibernateUtil;

public class PersonnelDAO extends HibernateUtil<Personnel> {

	public boolean login(String account, String password) {
		Session session = null;
		boolean login = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.get("account", account);
			session.get("password", password);
			List<?> list = session.createQuery("from Personnel").list();
			if (!list.isEmpty() && list.size() == 1) {
				login = true;
			}
		} catch (HibernateException e) {
			throw new RuntimeException(e);
		} finally {
			session.clear();
		}
		return login;
	}

	public Personnel selectByid(int id) {
		Personnel personnel=new Personnel();
		Session session = null;
		List<?> list;
		String hql="select * from Personnel p join PositionType pt on p.PositionTypeid =pt.id where p.id= :id";
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			SQLQuery query = session.createSQLQuery(hql);
			query.setParameter("id", 1);
			list=query.list();
			if(list.size()>0){
				personnel=(Personnel) list.get(0);
			}
		} catch (HibernateException e) {
			throw new RuntimeException(e);
		} finally {
			session.clear();
		}
		return personnel;
	}

	public List<?> selectAll() {
		Session session = null;
		List<?> list = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			list = session.createSQLQuery("select * from Personnel p join PositionType pt on p.PositionTypeid =pt.id")
					.list();

		} catch (HibernateException e) {
			throw new RuntimeException(e);
		} finally {
			session.clear();
		}
		return list;
	}

	//註冊用 
	public boolean checkAccount(String createAccount) {
		Session session = null;
		List<?> list = null;
		session = HibernateUtil.getSessionFactory().openSession();
		Criteria cr = session.createCriteria(Personnel.class); // 按类名查询
		Criterion cn = Restrictions.eq("account", createAccount); // 每个Criterion对象表示一个查询条件
		cr.add(cn); // 增加条件
		List<Personnel> studs = cr.list(); // 查询的结果是已经封装好的
		System.err.println(studs);
		session.clear();
		return false;
	}

	public String register() {
		return null;

	}

}
