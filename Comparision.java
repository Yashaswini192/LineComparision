package Bridge; 

import java.util.Scanner;
import java.lang.Math;
public class Comparision {

	public static void main(String[] args) {
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
		
		double firstLineLength = Math.sqrt((Math.pow(L1x2-L1x1,2))+(Math.pow(L1y2-L1y1,2)));
		System.out.println("Length of a line-1:"+firstLineLength);
		
		double secondLineLength = Math.sqrt((Math.pow(L2x2 - L2x1,2))+(Math.pow(L2y2 - L2y1,2)));
		System.out.println("Length of a line-2:"+secondLineLength);
		
		
		if (firstLineLength > secondLineLength) {
			System.out.println("first Line is bigger");
		}else if (firstLineLength < secondLineLength ){
			System.out.println("Second line is bigger");
		}else{
			System.out.println("Both are equal");
		}
	    s.close();
	}

}
