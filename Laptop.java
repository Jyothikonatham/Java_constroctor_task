package com.constructor;

public class Laptop {
	public String brand;
	public int ramSize;
	
	public Laptop(String Brand,int ram) {
		brand=Brand;
		ramSize=ram;
	}
	
		public Laptop() {
			brand="hp";
			ramSize=16;
	}
		public void showSpecs() {
			System.out.println("Laptop Brand :" + brand);
			System.out.println("Size of the Ram :" + ramSize);
		}
		public static void main(String[] args) {
			Laptop lap = new Laptop();
			Laptop lap1 = new Laptop("dell",8);
			lap.showSpecs();
			lap1.showSpecs();
		}
}
