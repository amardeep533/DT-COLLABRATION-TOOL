package com.cgi.org.DTCollabrationTool.model;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.faces.bean.RequestScoped;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cgi.org.DTCollabrationTool.Utils.HibernateUtil;
import com.cgi.org.DTCollabrationTool.dbclasses.Employee;
import com.cgi.org.DTCollabrationTool.dbclasses.Ideas;
import com.cgi.org.DTCollabrationTool.dbclasses.Userdetails;

public class UserDetailsDao {

	public static void retrieveUser() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		List<Userdetails> users = session.createQuery("from Userdetails as usr")
				.list();

		for (Userdetails user : users) {
			System.out.println(user.getUserid());
			System.out.println(user.getUsername());
			System.out.println(user.getUserpassword());
			System.out.println(user.getUsertype());
			System.out.println(user.getClass());
			System.out.println(user.getEmployeeid());
			Set<Ideas> ideas = user.getIdeases();
			Iterator iter = ideas.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
		}
		System.out.println("hi");
		session.close();
	}

	public static void main(String[] args) {
		retrieveUser();
	}
}
