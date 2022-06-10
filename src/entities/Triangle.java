package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	//incluindo funcao para o calculo da area do triangulo
	
	public double area() {
		double p = (a + b + c)/2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		/*uma opcao para retonar o valor
		 * double resoult = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return resoult;*/
	}

}
