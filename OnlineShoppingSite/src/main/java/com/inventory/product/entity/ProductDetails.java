package com.inventory.product.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;	
	@Column
	private String productname;
	@Column
	private String category;
	@Column
	private String brand;
	@Column 
	private int quantity;
	@Column
	private int price;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public ProductDetails() {
		
	}

//	public ProductDetails(String productname, String category, String brand, String price, int quantity) {
//		//super();
//		//this.productid = productid;
//		this.productname = productname;
//		this.category = category;
//		this.brand = brand;
//		this.price = price;
//		this.quantity = quantity;
//	}
	
	
	
	@Override
	public String toString() {
		return "ProductDetails [productid=" + productid + ", productname=" + productname + ", category=" + category
				+ ", brand=" + brand + ", price=" + price + "]";
	}
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
