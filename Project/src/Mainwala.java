import java.util.Scanner;
import java.util.Random;
public class Mainwala {
	public static void main(String[]args) {
		Random rand= new Random();
		Scanner input=new Scanner(System.in);
		
		int a3= rand.nextInt(10);
		int b3= rand.nextInt(10);
		int c3= rand.nextInt(10);
		int d3= rand.nextInt(10);
		String a= String.valueOf(a3);
		String b= String.valueOf(b3);
		String c= String.valueOf(c3);
		String d= String.valueOf(d3);
		
		
		String a2;
		String c2;
		String b2;
		String d2;
		String a1=a.concat(b);
	 a1=a1.concat(c);
	 a1=a1.concat(d);
	 int joy= Integer.parseInt(a1);
		for(int i=1; i<=6; i++) {
		System.out.println("Enter the number from 0 to 9");
		String w= input.nextLine();
		String x= input.nextLine();
		String y= input.nextLine();
		String z= input.nextLine();
		String w1=w.concat(x);
		 w1=w1.concat(y);
		 w1=w1.concat(z); 	
		 int w3= Integer.parseInt(w);
			int x3= Integer.parseInt(x);
			int y3= Integer.parseInt(y);
			int z3= Integer.parseInt(z);
			int esh= Integer.parseInt(w1);
		 if(w3==a3) {
			 a2="C";
		 }
		 else if(w3==b3|| w3==c3 || w3==d3) {
			 a2="A";
		 }
		 else {
			 a2="W";
		 }
			 
	if(x3==b3) {
		 b2="C";
	 }
	 else if(x3==a3|| x3==c3 || x3==d3) {
		  b2="A";
	 }
	 else {
		 b2="W";
	 }
		 
if(y3==c3) {
	 c2="C";
 }
 else if(y3==b3|| y3==a3 || y3==d3) {
	  c2="A";
 }
 else {
	 c2="W";
 }
if(z3==d3) {
	 d2="C";
 }
 else if(z3==b3|| z3==c3 || z3==a3) {
	  d2="A";
 }
 else {
	 d2="W";
 }

	System.out.println(w3+" "+x3+" "+y3+" "+z3);
		System.out.println(a2+" "+b2+" "+c2+" "+d2);

		if(esh==joy) {
			System.out.println("");
			System.out.println("");
			System.out.println("Badhai cha");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			break;
		}
		} 
		
		 System.out.println(a1);
		 
		 input.close();
	}
}
		

	 
