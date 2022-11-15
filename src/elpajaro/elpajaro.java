package elpajaro;

/**
 * 
 * @author Pau Martinez
 *
 */

//No está definido correctamente, porque no se inicia con un main
public class elpajaro {
	public static void main(String[] args) {

	}

	private String color;
	private Integer edad;

	void setEdad(int e) {
		edad = e;
	}

	void printEdad() {
		System.out.println(edad);
	}

	void setcolor(String c) {
		color = c;
		System.out.println("Tu color es " + color + " y tienes " + edad + " años");
	}

}
//Este ejemplo de clase se utiliza para familiarizarnos con la creación de objetos en java.