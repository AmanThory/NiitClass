package bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;

@Entity
@Table
public class Customer {

	@Id
	int c_id;
	String custormer;
	
	@OneToOne
	Supplier supplier;
	public Supplier getSupplier() {
		return supplier;
	}
	
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getCustormer() {
		return custormer;
	}
	public void setCustormer(String custormer) {
		this.custormer = custormer;
	}
}
