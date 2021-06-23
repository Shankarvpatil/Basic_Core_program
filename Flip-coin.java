package com.LargestAmongThree;

import java.util.Scanner;

public class LargestAmongThree {
		Scanner input;
		static int cnt =1;
		
		public LargestAmongThree() {
			input = new Scanner(System.in);
		}
		
		public int getNumber() {
			System.out.print("Enter the num"+cnt+": ");
			cnt++;
			return input.nextInt();
		}
																			
		public void getLargestNumber(int num1, int num2, int num3) {
			int FirstCond, SecondCond;
			FirstCond = (num1>num2)? num1:num2; 
			SecondCond = (FirstCond>num3)? FirstCond:num3; 
			System.out.println(SecondCond+" is greatest among "+num1+", "+num2+", "+num3);
		}
		
	public static void main(String[] args) {
		
		LargestAmongThree obj = new LargestAmongThree();
		int num1 = obj.getNumber();
		int num2 = obj.getNumber();
		int num3 = obj.getNumber();
		obj.getLargestNumber(num1, num2, num3);
	}

}
