package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		//modificando aqui no git
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = teclado.nextDouble();
		xB = teclado.nextDouble();
		xC = teclado.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = teclado.nextDouble();
		yB = teclado.nextDouble();
		yC = teclado.nextDouble();
		
		double p = (xA + xB + xC) / 2.00;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) - (p - xC));
		
		p = (yA + yB + yC) / 2.00;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Large area: X");
		}
		else {
			System.out.println("Large area: Y");
		}
		
		teclado.close();

	}

}
