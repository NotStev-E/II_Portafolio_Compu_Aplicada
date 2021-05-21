package scl.edu.gt;
import java.util.Scanner;
public class ArithmeticFunctions {
	
	
	public static void suma() {
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("1er numero: ");
		double num_1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("2do numero: ");
		double num_2 = numeral2.nextDouble();
		
		double resultado = num_1 + num_2;
		System.out.println(resultado);
	}
	public static void resta() {
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("1er numero: ");
		double num_1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("2do numero: ");
		double num_2 = numeral2.nextDouble();
		
		double resultado = num_1 - num_2;
		System.out.println(resultado);
	}
	public static void division() {
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("1er numero: ");
		double num_1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("2do numero: ");
		double num_2 = numeral2.nextDouble();
		
		double resultado = num_1 / num_2;
		System.out.println(resultado);
	}
	public static void multiplicacion() {
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("1er numero: ");
		double num_1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("2do numero: ");
		double num_2 = numeral2.nextDouble();
		
		double resultado = num_1 * num_2;
		System.out.println(resultado);
	}
	public static void residuo() {
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("1er numero: ");
		double num_1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("2do numero: ");
		double num_2 = numeral2.nextDouble();
		
		double resultado = num_1 % num_2;
		System.out.println(resultado);
	}
	
}
