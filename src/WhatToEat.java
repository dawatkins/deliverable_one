import java.util.Scanner;

public class WhatToEat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String eventType;
		int partySize;
		String result = null;
		String CASUAL = "casual";
		String SEMI_FORMAL = "semi-formal";
		String FORMAL = "formal";
		
		System.out.println("What type of event are you hosting? (casual, semi-formal, or formal): ");
		eventType = sc.nextLine();
		//eventType = eventType.toLowerCase();
		
		System.out.print("What is your party size? ");
		partySize = sc.nextInt();
		
		
		if (eventType.equals(CASUAL)) {
			if(partySize >= 13) {
				result = "Since you're hosting a " + eventType + " party for " + partySize + " participants, you should serve sandwhiches prepared by a caterer.";
			} else if(partySize >= 2){
				result = "Since you're hosting a " + eventType + " party for " + partySize + " participants, you should serve sandwhiches prepared in your kitchen.";
			} else {
				result = "Since you're hosting a " + eventType + " party for " + partySize + " participants, you should serve sandwhiches prepared in the microwave.";
			}
		} else if (eventType.equals(SEMI_FORMAL)) {
			if(partySize >= 13) {
				result = "Since you're hosting a " + eventType + " party for " + partySize + " participants, you should serve fried chicken prepared by a caterer.";
			} else if(partySize >= 2){
				result = "Since you're hosting a " + eventType + " party for " + partySize + " participants, you should serve fried chicken prepared in your kitchen.";
			} else {
				result = "Since you're hosting a " + eventType + " party for " + partySize + " participants, you should serve fried chicken prepared in the microwave.";
			}
		} else if (eventType.equals(FORMAL)) {
			if(partySize >= 13) {
				result = "Since you're hosting a " + eventType + " party for " + partySize + " participants, you should serve chicken parmesan prepared by a caterer.";
			} else if(partySize >= 2){
				result = "Since you're hosting a " + eventType + " party for " + partySize + " participants, you should serve chicken parmesean prepared in your kitchen.";
			} else {
				result = "Since you're hosting a " + eventType + " part for " + partySize + " participants, you should serve chicken parmesean prepared in the microwave.";
			}
		} else {
			System.out.println("You entered invalid inputs.");
		}
		
	
		sc.close();
		System.out.println(result);
	}
}
