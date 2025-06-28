import java.util.*;
public class Bus_Booking_System {

	public static void main(String[] args) {
		
	 System.out.println("Bus Booking System");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your name:");
     String s = sc.next();
     
     
     System.out.println("want to book in KM or not:");
     String km = sc.next();
     
     
     
     if(km.equals("yes")){
    	 int ab =1;
         int bc =0;
         while(bc<ab) {
    	 int perkm = 10;
    	 System.out.println("Number of passengers:");
    		int n = sc.nextInt();
    		 System.out.println("Number of KM:");
    		 int v = sc.nextInt();
    		 System.out.println("total:" + n*(v*perkm));
    		 
    		 System.out.println("want to check more:");
    		    String za = sc.next();
    		    if(za.equals("yes")) {
    		    	ab++;
    		    	bc++;
    		    }
    		    else {
    		    	break;
    		    }
    		 
	}
	}
     else {
     int a=1;
     int b=0;
     
     
while(b<a) {
	System.out.println("Number of passengers:");
	int n = sc.nextInt();
    String pickup = sc.next();
    String destination = sc.next();
     if(pickup.equals("delhi") && destination.equals("mumbai")) {
     		System.out.println("the rent for each  person is: "+ 100);
     		System.out.println("the rent for n persons is: "+ n*100);
	}
     else  if(pickup.equals("mumbai") && destination.equals("delhi")) {
  		System.out.println("the rent for each  person is: "+ 1000);
  		System.out.println("the rent for n persons is: "+ n*1000);
	}
     else  if(pickup.equals("delhi") && destination.equals("pune")) {
  		System.out.println("the rent for each  person is: "+ 1200);
  		System.out.println("the rent for n persons is: "+ n*1200);
	}
     else  if(pickup.equals("pune") && destination.equals("delhi")) {
   		System.out.println("the rent for each person is: "+ 1200);
   		System.out.println("the rent for n persons is: "+ n*1200);
 	}
     else  if(pickup.equals("delhi") && destination.equals("bangluru")) {
    		System.out.println("the rent for each person is: "+ 1900);
    		System.out.println("the rent for n persons is: "+ n*1900);
  	}
     System.out.println("want to check more:");
    String z = sc.next();
    if(z.equals("yes")) {
    	b++;
    	a++;
    }
    else {
    	break;
    }
}
	}
	}
}
