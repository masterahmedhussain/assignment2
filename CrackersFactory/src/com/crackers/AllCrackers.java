package com.crackers;

public class AllCrackers extends CrackerFactory {
	

	Cracker createCracker(String item) {
		if (item.equals("ritz")) {
			return new RitzCracker();
		}else if (item.equals("cheez-it")){
			return new CheezitCracker();
		}else if (item.equals("graham")) {
			return new GrahamCracker();
		}else return null;	
	}

}
