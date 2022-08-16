package com.cg.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		department department1 = new department();
		department1.setId(01);
		department1.setName("C2TC");
		
		employee employee = new employee();
		employee.setId(1);
		employee.setName("payal");
		employee.setSalary(1000);
		
		department1.addemployee(employee);
		
		manager.persist(department1);
		
		manager.getTransaction().commit();
		System.out.println("Added employee and manager");
		
		manager.close();
		factory.close();

}
}
