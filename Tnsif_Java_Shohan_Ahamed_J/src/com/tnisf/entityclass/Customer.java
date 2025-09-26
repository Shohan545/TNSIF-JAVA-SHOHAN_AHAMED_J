package com.tnisf.entityclass;

public class Customer {
	private int id=89;
	private String cname="Shohan";
	private String city="Gingee";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cname=" + cname + ", city=" + city + "]";
	}
	
}
