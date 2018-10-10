package conversionLogic;

import java.util.Scanner;
import java.util.concurrent.*;
public class Conversion {

	

	public Conversion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		

	}

}
class OperationA extends Thread
{
	Scanner input = new Scanner(System.in);
			
	public static String denBin (int n) {
		String converted = Integer.toBinaryString(n);
		return converted;
	}
	public static String denHex (int n) {
		String converted = Integer.toHexString(n);
		return converted;
		
	}
	public static int binDen (String binary) {
		int converted = Integer.parseInt(binary);
		return converted;
		
	}
	public static int hexDen (String hex) {
		int converted = Integer.parseInt(hex);
		return converted;
		
	}
	public static String hexBin (String hex) {
		int convert = Integer.parseInt(hex);
		String converted = Integer.toBinaryString(convert);
		return converted;
	}
	public void run() {
		
		
	}
		
	}

class OperationB extends Thread
{
	Scanner input = new Scanner(System.in);
	public void run() {
		System.out.print("Which conversion would you like to perform?\n"
				+ "1: Denary to Binary\n"
				+ "2: Denary to Hex\n"
				+ "3: Binary to Denary\n"
				+ "4: Hex to Denary\n"
				+ "5: Hex to Binary\n");
		int sel = input.nextInt();
		switch(sel) {
		case 1: 
			System.out.println("What would you like to convert?");
			int n = input.nextInt();
			String converted = denBin(n);
			System.out.println(converted);
		case 2:
			System.out.println("What would you like to convert?");
			n = input.nextInt();
			converted = denHex(n);
			System.out.println(converted);
		case 3:
			System.out.println();
		}
	
}