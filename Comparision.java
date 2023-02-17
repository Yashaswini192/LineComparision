package Bridge; 

import java.util.Scanner;
import java.lang.Math;
public class Comparision {

	public static void main(String[] args, int firstLineLength, int secondLineLength) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter Line-1 x1 value:");
		int L1x1=s.nextInt();
		
		System.out.println("enter Line-1 x2 value:");
		int L1x2=s.nextInt();
		
		System.out.println("enter Line-1 y1 value:");
		int L1y1=s.nextInt();
		
		System.out.println("enter Line-1 y2 value:");
		int L1y2=s.nextInt();
		
		System.out.println("enter Line-2 x1 value:");
		int L2x1=s.nextInt();
		
		System.out.println("enter Line-2 x2 value:");
		int L2x2=s.nextInt();
		
		System.out.println("enter Line-2 y1 value:");
		int L2y1=s.nextInt();
		
		System.out.println("enter Line-2 y2 value:");
		int L2y2=s.nextInt();
		
		Comparision c = new Comparision();
		c.equals(firstLineLength,secondLineLength);
		
	}
	public boolean equals(int firstLineLength , int  secondLineLength) {
		if(firstLineLength == secondLineLength) {
		return true;
		}else {
			return false;
		}
	
	}
}