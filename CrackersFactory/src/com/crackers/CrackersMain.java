package com.crackers;

public class CrackersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				CrackerFactory ritzCracker = new RitzCrackers();
		 
				Cracker cracker = ritzCracker.makeCracker("ritz");
				System.out.println("getting ready " + cracker.getName() + "\n");
		 
			}
	}

