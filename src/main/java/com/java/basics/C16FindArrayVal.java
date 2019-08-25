package com.java.basics;

public class C16FindArrayVal {

	public static void main(String[] args) {
		
		String friends[] = {"balu","indra","devi","vaishu"}; 

		boolean isExist = false;
		for (int i = 0; i < friends.length; i++) {
			if(friends[i]=="devi") {
				isExist = true;
				break;
			}
		}
		
		if(isExist) {
			System.out.println("value is exist");
		}else {
			System.out.println("value not exist");
		}
	}

}
