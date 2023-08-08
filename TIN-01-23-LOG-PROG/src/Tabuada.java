import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int numI = 0;
		int numF = 0;
		int condParada = 1;
		int cont1 = 0;
		int cont2 = 0;
		
		Scanner lerDados = new Scanner(System.in);
		
		while(condParada == 1) {
			System.out.println("Tabuada Inicial: ");
			numI = lerDados.nextInt();
			System.out.println("Tabuada Final: ");
			numF = lerDados.nextInt();
			
			for(cont1 = numI; cont1 <= numF; cont1++){
				System.out.println("TABUADA DE: " + cont1);
				System.out.println("|============ | =============|");
				System.out.println("|   PRODUTO   |    SOMA      |");
				System.out.println("|============ | =============|");
				for(cont2 = 1; cont2 <= 9; cont2++) {
					System.out.println("| " + cont1 + " X " + cont2 + " = " + (cont1*cont2) + "  |  " + cont1 + " + " + cont2 + " = " + (cont1+cont2) + " |");
				}
			}
			System.out.println("Deseja montar outro conjunto de Tabuadas?");
			System.out.println("1 - Sim. | 2 - Não.");
			condParada = lerDados.nextInt();
		}
		System.out.println("Tabuada montada.");
	}
}
