package elpajaro;
import java.util.Scanner;
/**
 * 
 * @author Pau Martinez
 *
 */
public class rebajas {
	public static void main(String[] args) {
		
	
	Scanner in = new Scanner(System.in);
	System.out.print("How old are you?");
	int age = in.nextInt();
	
	System.out.print("What is your weight?");
	double weight = in.nextDouble();
	int edad2 = age + 1;
	double pesoideal = weight * 0.9;
	System.out.println("El año que viene tendras" + edad2+ "y deberias pesar" + pesoideal);
	
}
}