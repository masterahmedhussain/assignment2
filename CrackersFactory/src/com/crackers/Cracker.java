package com.crackers;

public abstract class Cracker {
		String name;
		
		void prepare() {
			System.out.println("preparing "+ name);
			System.out.println("mixing ingriedients");
			}
		void addSalt() {
			System.out.println("add salt toppings.....");
		}
		void bake() {
			System.out.println("Bake at 300");
		}
		void cut() {
			System.out.println("cut into pieces....");
		}
		void pack() {
			System.out.println("place the crackers in box ");
		}

		public String getName() {
			return name;
		}
		public String toString() {
			StringBuffer display = new StringBuffer();
			display.append("---- " + name + " ----\n");
			return display.toString();
		}
}
