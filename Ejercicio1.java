import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("De que figura quieres calcular el area? (circulo/triangulo/cuadrado)");
		String figura = sc.next();
		
		if (figura.equals("circulo")) {
			System.out.println("Escribe el radio");
			double rad = sc.nextDouble();
			double resultado = area_circ(rad);
			System.out.println("El area del circulo es: " + resultado);
			
		}else if (figura.equals("triangulo")) {
			System.out.println("Escribe la base");
			double base = sc.nextDouble();
			System.out.println("Escribe la altura");
			double altura = sc.nextDouble();
			double resultado = area_triang(base, altura);
			System.out.println("El area del triangulo es: " + resultado);
			
		}else if (figura.equals("cuadrado")) {
			System.out.println("Escribe el lado");
			double lado = sc.nextDouble();
			double resultado = area_cuad(lado);
			System.out.println("El area del cuadrado es: " + resultado);
		}else {
			System.out.println("No ha seleccionado ninguna de las figuras");
		}

	}
	
	public static double area_circ (double rad) {
		double resultado = Math.PI * Math.pow(rad, 2);
		return resultado;
	}
	
	public static double area_triang(double b, double a) {
		double resultado = (b*a)/2;
		return resultado;
	}
	
	public static double area_cuad(double lado) {
		double resultado = lado*lado;
		return resultado;
	}

}
