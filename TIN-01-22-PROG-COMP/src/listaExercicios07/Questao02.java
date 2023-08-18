package listaExercicios07;
import java.util.Scanner;
public class Questao02 {
	public static void main(String[] args) {
		double num1=0, num2=0;
		int operacao=0, saida=1;
		
		OperacoesMatematicas operar = new OperacoesMatematicas();
		Scanner lerNum = new Scanner(System.in);
		Scanner lerOper = new Scanner(System.in);
		
		while(saida == 1) {
			System.out.println("Informe o 1o. No.: ");
			num1 = lerNum.nextDouble();
			System.out.println("Informe o 2o. No.: ");
			num2 = lerNum.nextDouble();
			System.out.println("OPERAÇÃO MATEMÁTICA:\n1. Somar \n2. Substrair \n3. Multiplicar \n4. Divisao.");
			operacao = lerOper.nextInt();
			
			switch(operacao) {
				case 1:
					System.out.println("OPERAÇÃO DE SOMA...");
					System.out.println("SOMA = " + operar.somar(num1, num2));
					break;
				case 2:
					System.out.println("OPERAÇÃO DE SUBTRAÇÃO...");
					System.out.println("DIFERENÇA = " + operar.subtrair(num1, num2));
					break;
				case 3:
					System.out.println("OPERAÇÃO DE MULTPLICAÇÃO...");
					System.out.println("PRODUTO = " + operar.multiplicar(num1, num2));
					break;
				case 4:
					System.out.println("OPERAÇÃO DE DIVISÃO...");
					System.out.println("DIVISÃO = " + operar.dividir(num1, num2));
					break;
				default:
					System.out.println("Operação não definida...");
			}
			
			System.out.println("Continuar? 1 Sim | 2 Não");
			saida = lerOper.nextInt();
		}
		System.out.println("Obrigado!");
	}
}
