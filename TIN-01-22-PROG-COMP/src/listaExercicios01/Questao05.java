package listaExercicios01;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		double salario;
		
		Scanner lerSalario = new Scanner(System.in);
		
		System.out.println("Salário: ");
		salario = lerSalario.nextDouble();
		
		if(salario <= 1000){
			System.out.printf("\n\nSalário Sem Reajuste: %.2f", salario);
			System.out.println("\nPercentual de Reajuste: 20%");
			System.out.printf("Aumento: %.2f", (salario * 0.2));
			System.out.printf("\nNovo Salário: %.2f", salario + (salario * 0.2));
		}else if((salario > 1000) && (salario <= 1500)){
			System.out.printf("\n\nSalário Sem Reajuste: %.2f", salario);
			System.out.println("\nPercentual de Reajuste: 15%");
			System.out.printf("Aumento: %.2f", (salario * 0.15));
			System.out.printf("\nNovo Salário: %.2f", salario + (salario * 0.15));
		}else if((salario > 1500) && (salario <= 2000)){
			System.out.printf("\n\nSalário Sem Reajuste: %.2f", salario);
			System.out.println("\nPercentual de Reajuste: 10%");
			System.out.printf("Aumento: %.2f", (salario * 0.10));
			System.out.printf("\nNovo Salário: %.2f", salario + (salario * 0.10));
		}else{
			System.out.printf("\n\nSalário Sem Reajuste: %.2f", salario);
			System.out.println("\nPercentual de Reajuste: 5%");
			System.out.printf("Aumento: %.2f", (salario * 0.05));
			System.out.printf("\nNovo Salário: %.2f", salario + (salario * 0.5));
		}
		lerSalario.close();
	}
}
