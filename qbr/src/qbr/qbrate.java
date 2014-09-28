package qbr;

import java.util.Scanner;

public class qbrate {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		  System.out.println("TD: ");
		  float touchdowns = x.nextInt();
		  
		  System.out.println("Yards: ");
		  float yards_total = x.nextInt();
		  
		  System.out.println("INT: "); 
		  float interceptions = x.nextInt();
		  
		  System.out.println("Comp: ");
		  float Completions = x.nextInt();
		  
		  System.out.println("ATT: ");
		  float passes_att = x.nextInt();
		  
		  		  
		  float YDS = (float) ((((yards_total)/passes_att)-3)*0.25);
		  float TDs= (float) (((touchdowns/passes_att)*100)*0.2);
		  float Comp= (float) ((((Completions/passes_att)*100)-30)*0.05);
		  float INT= (float) ((2.375-(interceptions/passes_att)*100)*0.25);
		  
		  
		  
		  float QB_rate=  (((YDS+TDs+Comp+INT)/6)*100);
		  
		  
		  String qbr = String.format("%.2f", QB_rate);
		  
		  System.out.println("QB rate: " + qbr );
		  }
		 
	}
	