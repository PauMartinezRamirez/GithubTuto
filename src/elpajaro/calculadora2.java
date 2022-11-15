package elpajaro;

import java.io.IOException;
import java.util.Scanner;

public class calculadora2 {
	public static void main(String[] args) throws IOException {
		// Inicialización y Entrada
		Scanner sc = new Scanner(System.in);
		double num1, num2, res = 0;
		char operacion;
		System.out.print("Introduce el primero número: ");
		num1 = sc.nextDouble();
		System.out.print("Introduce el segundo número: ");
		num2 = sc.nextDouble();
		System.out.print("Introduce la operación (+, -,/,*): ");

		operacion = (char) System.in.read();

		// Proceso
		// Salida
		switch (operacion) {
		case '+':
			res = num1 + num2;
		case '-':
			res = num1 - num2;
		case '*':
			res = num1 * num2;
		case '/':
			res = num1 / num2;
		}
		System.out.println("El resultado es = " + res);
	}
}
