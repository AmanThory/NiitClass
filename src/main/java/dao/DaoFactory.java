package dao;

import java.util.ArrayList;

import bean.Customer;
import bean.Product;
import bean.Supplier;
import bean.User;

public abstract class DaoFactory {

	public static DaoFactory getDao() {
		
		DaoFactory dao = new SqlDao();
		
		return dao;
	}
	public abstract boolean registration(User user,User user2,Product pr2,Product p);
	public abstract boolean dataMapping(Customer c);
}
