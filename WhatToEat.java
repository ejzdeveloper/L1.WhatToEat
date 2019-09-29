// Author:Jackie Zablah. Java Bootcamp 2019
// program that will inform the user how they should prepare for dinner
//based on two conditions: the party size and the event type.

package lab1_1;

import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {
		String eventType;
		int partySize;
		String result = null;
		Scanner scnr = new Scanner(System.in);
		String userContinue = null;

		do {
			System.out.println("Please enter the type of the event (casual/semi-formal/formal): <<");
			eventType = scnr.next();
			System.out.println("Please enter the party size (how many guests?): <<");
			partySize = scnr.nextInt();

			if (eventType.equalsIgnoreCase("casual")) {
				if (partySize <= 0) {
					System.out.println("please enter a valid number (starting from 1)");
				} else if (partySize == 1) {
					result = ("Since you’re hosting a " + eventType + " event for " + partySize
							+ " participants, you should serve sandwiches\r\n" + "prepared in the microwave.");
				} else if ((partySize >= 2) && (partySize <= 12)) {
					result = ("Since you’re hosting a " + eventType + " event for " + partySize
							+ " participants, you should serve sandwiches\r\n" + "prepared in your kitchen.");
				} else {
					result = ("Since you’re hosting a " + eventType + " event for " + partySize
							+ " participants, you should serve sandwiches\r\n" + "prepared by a caterer.");
				}
			}

			if (eventType.equalsIgnoreCase("semi-formal")) {
				if (partySize <= 0) {
					System.out.println("please enter a valid number (starting from 1)");
				} else if (partySize == 1) {
					result = ("Since you’re hosting a " + eventType + " event for " + partySize
							+ " participants, you should serve fried chicken\r\n" + "prepared in the microwave.");
				} else if ((partySize >= 2) && (partySize <= 12)) {
					result = ("Since you’re hosting a " + eventType + " event for " + partySize
							+ " participants, you should serve fried chicken\r\n" + "prepared in your kitchen.");
				} else {
					result = ("Since you’re hosting a " + eventType + " event for " + partySize
							+ " participants, you should serve fried chicken\r\n" + "prepared by a caterer.");
				}
			}

			if (eventType.equalsIgnoreCase("formal")) {
				if (partySize <= 0) {
					System.out.println("please enter a valid number (starting from 1)");
				} else if (partySize == 1) {
					result = ("Since you’re hosting a " + eventType + " event for " + partySize
							+ " participants, you should serve chicken parmesan\r\n" + "prepared in the microwave.");
				} else if ((partySize >= 2) && (partySize <= 12)) {
					result = ("Since you’re hosting a " + eventType + " event for " + partySize
							+ " participants, you should serve chicken parmesan\r\n" + "prepared in your kitchen.");
				} else {
					result = ("Since you’re hosting a " + eventType + " event for " + partySize
							+ " participants, you should serve chicken parmesan\r\n" + "prepared by a caterer.");
				}
			}

			System.out.println(result);
			System.out.println("Would you like to continue (y/n)? <<");
			userContinue = scnr.next();
			result = "";
			if (userContinue.equalsIgnoreCase("n")) {
				System.out.println("Goodbye!!");
			}

		} while (userContinue.equalsIgnoreCase("y"));
		scnr.close();

	}

}
