import java.util.Scanner;
public class LE03_Q07_Rev00 {
	public static void main(String[] args) {
		int cont; int qPar = 0; int qImpar = 0; float num = 0;
		
		Scanner lerNum = new Scanner(System.in);
		
		for(cont = 1; cont <= 4; cont++) {
			System.out.println("Nº.: ");
			num = lerNum.nextFloat();
			if(num % 2 == 0) { // %(percentual) é o mod no pseudocódigo
				qPar++;
			}else {
				qImpar++;
			}
		}
		System.out.println("Total de Pares: " + qPar);
		System.out.println("Total de Impares: " + qImpar);
	}
}
