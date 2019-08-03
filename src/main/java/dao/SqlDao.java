package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.Customer;
import bean.Product;
import bean.Supplier;
import bean.User;

public class SqlDao extends DaoFactory {

	Session sess = null;
	boolean b = false;
	Transaction trans;
	@Override
	public boolean registration(User user,User user2,Product pr2,Product p) {
		
		try {
		    sess = DbConnection.getSession();
		    trans = sess.beginTransaction();
		    sess.save(user);
		    sess.save(user2);
		    sess.save(p);
			sess.save(pr2);
			sess.close();
			trans.commit();
			b = true;
		}catch(Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
		return b;
	}
	@Override
	public boolean dataMapping(Customer c) {
		try {
			System.out.println("dataMapping method");
		    sess = DbConnection.getSession();
		    trans = sess.beginTransaction();
		    sess.save(c);
			sess.close();
			trans.commit();
			System.out.println("dataMapping method end");
			b = true;
		}catch(Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
		return b;
	}
		
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
