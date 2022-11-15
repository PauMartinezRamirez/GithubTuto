package elpajaro;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		caculateValues();
	}

	static void caculateValues() {
		int a, b;
		int resulta, results, resultm;
		float resultd;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número:");
		a = sc.nextInt();
		System.out.print("Introduce otro número:");
		b = sc.nextInt();
		resulta = (a + b);
		results = (a - b);
		resultm = (a * b);
		resultd = (a / b);

		System.out.println("El resultado de la suma es:  " + resulta);
		System.out.println("El resultado de la resta es: " + results);
		System.out.println("El resultado de la multiplicación es:  " + resultm);
		System.out.println("El resultado de la división es:  " + resultd);
	}
}