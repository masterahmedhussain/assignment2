package com.crackers;

//public abstract class CrackerFactory {
//	
//	public void makeCracker(String name){
//		Cracker cracker = null;
//		System.out.println("Making " + name );
//		cracker.prepare();
//		
//		
//		
//	}
//}

public abstract class CrackerFactory {
	 
	abstract Cracker createCracker(String item);
 
	public Cracker makeCracker(String type) {
		Cracker cracker = createCracker(type);
//		System.out.println("--- Making a " + cracker.getName() + " ---");
		cracker.prepare();
		cracker.bake();
		cracker.cut();
		cracker.pack();
		return cracker;
	}
}
