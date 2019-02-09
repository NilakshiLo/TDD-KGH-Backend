package com.in28minutes.jee;

public class Counter {
	public int orders;
	public int inq;
	public int rooms;
	public int emp;
	Counter(int orders, int inq, int rooms, int emp){
		this.orders = orders;
		this.inq = inq;
		this.rooms = rooms;
		this.emp = emp;
	}
	public int getOrders() {
		return orders;
	}
	public void setOrders(int orders) {
		this.orders = orders;
	}
	public int getInq() {
		return inq;
	}
	public void setInq(int inq) {
		this.inq = inq;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getEmp() {
		return emp;
	}
	public void setEmp(int emp) {
		this.emp = emp;
	}
	
}
