package listaExercicios01;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		double num01, num02;
		
		Scanner lerNum = new Scanner(System.in);
		
		System.out.println("1o. Nº.: ");
		num01 = lerNum.nextDouble();
		System.out.println("2o. Nº.: ");
		num02 = lerNum.nextDouble();
		
		System.out.println("SOMANDO........: " + num01 + " + " + num02 + " = " + (num01 + num02));
		System.out.println("SUBTRAINDO.....: " + num01 + " - " + num02 + " = " + (num01 - num02));
		System.out.println("MULTIPLICANDO..: " + num01 + " * " + num02 + " = " + (num01 * num02));
		System.out.printf("DIVIDINDO......: %.2f / %.2f = %.2f", num01, num02, (num01 / num02));
		
		lerNum.close();
	}
}
