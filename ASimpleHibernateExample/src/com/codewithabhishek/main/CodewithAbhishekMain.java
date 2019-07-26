package com.codewithabhishek.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CodewithAbhishekMain {

	public static void main(String[] args) {

		StandardServiceRegistry standardserviceregistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardserviceregistry).getMetadataBuilder().build();

		SessionFactory sessionfactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();

		InfomationBean informationbean = new InfomationBean();

		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String Name = sc.next();
		System.out.println("Enter your last Name");
		String lastname = sc.next();
		System.out.println("Enter your PhoneNumber");
		String pho = sc.next();

		informationbean.setName(Name);
		informationbean.setLname(lastname);
		informationbean.setPh(pho);

		session.save(informationbean);

		tx.commit();

		System.out.println("Data stored in Data Base");
		sessionfactory.close();
		session.close();

	}

}
