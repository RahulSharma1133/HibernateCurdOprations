package org.springframework.HibernateCrudOperations;

import org.springframework.HibernateCrudOperations.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

//		User user = new User();
//		user.setId(1);
//		user.setName("Ram");
//		user.setEmail("rahul@gmail.com");
//		user.setPassword("1234");
//		user.setGender("male");
//		user.setCity("Jaipur");


//		User user3 = new User();
//		user3.setId(4);
//		user3.setName("Anit");
//		user3.setEmail("amit@gmail.com");
//		user3.setPassword("amit4423");
//		user3.setGender("male");
//		user3.setCity("Dausa");

		Configuration cfg = new Configuration();
		cfg.configure("/hibernate.cfg.xml");


		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();


//		------------------ INSERT OPRATIONS ---------------------->
//		try {
//			session.save(user3); // provide the CURD operations
//			transaction.commit(); // permanent save the data in database
//			System.out.println("User deteails added successfully");
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			System.out.println("User details not added due to some error");
//		}


//		------------------- SELECT OPRATIONS ----------------------->
//		try{
//			session.get(User.class, 3);
//			System.out.println(user3.getId());
//			System.out.println(user3.getName());
//			System.out.println(user3.getEmail());
//			System.out.println(user3.getPassword());
//			System.out.println(user3.getGender());
//			System.out.println(user3.getCity());
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("User Not found");
//		}

//
////		--------- UPDATE OPRATIONS ------------------------->
//		User user3 = new User();
//		user3.setId(4);
//		user3.setCity("PUNE");
//
//
//		try {
////			session.saveOrUpdate(user3); // provide the CURD operations
//			User user = session.get(User.class, 3); // secound mothed to update details
//			user.setCity("MUMBAI");
//			transaction.commit(); // permanent save the data in database
//			System.out.println("User deteails Updated successfully");
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			System.out.println("User details not Updated due to some error");
//		}



//		--------- DELETE OPRATIONS ------------------------->
		User user3 = new User();
		user3.setId(4);
		user3.setCity("PUNE");


		try {
			session.delete(user3); // provide the CURD operations
			transaction.commit(); // permanent save the data in database
			System.out.println("User DELETED successfully");
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			System.out.println("User details not DELETED due to some error");
		}
	}
}
