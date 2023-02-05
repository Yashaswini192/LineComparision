package Bridge; 

import java.util.Scanner;
import java.lang.Math;
public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter x1 value:");
		int x1=s.nextInt();
		System.out.println("enter x2 value:");
		int x2=s.nextInt();
		System.out.println("enter y1 value:");
		int y1=s.nextInt();
		System.out.println("enter y2 value:");
		int y2=s.nextInt();
		double Length =Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)));
		System.out.println("Length of a line:"+Length);
	    s.close();
	}

}
