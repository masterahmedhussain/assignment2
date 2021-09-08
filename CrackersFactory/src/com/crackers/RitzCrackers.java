package com.crackers;

public class RitzCrackers extends CrackerFactory {
	

		Cracker createCracker(String item) {
			if (item.equals("ritz")) {
				return new RitzCracker();}
				else return null;
			}

}
