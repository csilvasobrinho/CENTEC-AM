package enumeracao.declaracao;
import java.util.Scanner;
public class EnumsMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String planeta;
		
		System.out.println("Para qual planeta deseja viajar...?");
		planeta = entrada.next().toUpperCase();
		
		/*
		for(EnumPlanetas p : EnumPlanetas.values()) {
			System.out.printf("%s%n", p);
		}
		*/
		ClasseTesteEnum pl = new ClasseTesteEnum(planeta);
		pl.viajarPlaneta();
		
		entrada.close();
		
		
	}
}
