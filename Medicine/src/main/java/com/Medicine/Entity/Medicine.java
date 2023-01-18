package com.Medicine.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Medicine")
public class Medicine {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String medicineName;
	private int price;
	private String mfdDate;
	private String expDate;
	private int quantity;
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicine(int id, String medicineName, int price, String mfdDate, String expDate, int quantity) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.price = price;
		this.mfdDate = mfdDate;
		this.expDate = expDate;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMfdDate() {
		return mfdDate;
	}
	public void setMfdDate(String mfdDate) {
		this.mfdDate = mfdDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}