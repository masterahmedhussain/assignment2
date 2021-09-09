package com.crackers;

public class CrackersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CrackerFactory allCrackers = new AllCrackers();
		 
		Cracker ritzCracker = allCrackers.makeCracker("ritz");
		System.out.println("getting ready " + ritzCracker.getName() + "\n");
		
		Cracker cheezitCracker = allCrackers.makeCracker("cheez-it");
		System.out.println("getting ready " + cheezitCracker.getName() + "\n");
		
		Cracker grahamCracker = allCrackers.makeCracker("graham");
		System.out.println("getting ready " + grahamCracker.getName() + "\n");
		 
			}
	}

