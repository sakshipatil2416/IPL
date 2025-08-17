package service;

import java.util.Scanner;
import entity.Team;
import repository.Teamrepository;

public class Teamservice {
	
	public void selectOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to IPL portal ");
		System.out.println("Please select following options - ");
		System.out.println("1. Get All Team Details");
		System.out.println("2. Get team details by short name");

		int input = sc.nextInt();
		System.err.println("You have selected option : " + input);

		switch (input) {
		//get All team details
		case 1: {
			System.out.println(Teamrepository.getMITeamDetails());
			System.out.println(Teamrepository.getCSKTeamDetails());
			System.out.println(Teamrepository.getRCBTeamDetails());
			System.out.println(Teamrepository.getKKRTeamDetails());
			System.out.println(Teamrepository.getDCTeamDetails());
			System.out.println(Teamrepository.getRRTeamDetails());
			System.out.println(Teamrepository.getSRHTeamDetails());
			System.out.println(Teamrepository.getGTTeamDetails());
			System.out.println(Teamrepository.getLSGTeamDetails());
			System.out.println(Teamrepository.getPBKSTeamDetails());
			// call all remaining 8 team methods here

			break;
		}
		//get team details by short Name
		case 2: {
			System.out.println("Please enter your fav team's short name : ");
			String teamShortName = sc.next();
			System.err.println("entered team short name is  : " + teamShortName);
			getTeamByShortName(teamShortName);
			break;
		}
		case 3 : {
			// for get team details by ID
			// further logic should not have switch case
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}

	private void getTeamByShortName(String shortName) {
		// here we will write a code logic to get team details by short name
		switch (shortName) {
		case "MI": {
			System.out.println(Teamrepository.getMITeamDetails());
			break;
		}
		case "CSK" : {
			System.out.println(Teamrepository.getCSKTeamDetails());
			break;
		}
		
		case "RCB" : {
			System.out.println(Teamrepository.getRCBTeamDetails());
			break;
		}
		
		case "KKR" : {
			System.out.println(Teamrepository.getKKRTeamDetails());
			break;
		}
		case "DC" : {
			System.out.println(Teamrepository.getDCTeamDetails());
			break;
		}
		case "RR" : {
			System.out.println(Teamrepository.getRRTeamDetails());
			break;
		}
		case "SRH" : {
			System.out.println(Teamrepository.getSRHTeamDetails());
			break;
		}
		case "GT" : {
			System.out.println(Teamrepository.getGTTeamDetails());
			break;
		}
		case "LSG" : {
			System.out.println(Teamrepository.getLSGTeamDetails());
			break;
		}
		case "PBKS" : {
			System.out.println(Teamrepository.getPBKSTeamDetails());
			break;
		}
		
		// add remaining teams cases here.
		default:
			throw new IllegalArgumentException("Unexpected value: " + shortName);
		}
	}

}
	
   