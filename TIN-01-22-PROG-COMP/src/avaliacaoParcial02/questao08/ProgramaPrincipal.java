package avaliacaoParcial02.questao08;
import java.util.Scanner;
public class ProgramaPrincipal {
	public static void main(String[] args) {
		String ctrlParada="S";
		int cont=1;
		
		double n01=0, n02=0, n03=0, n04=0, m=0;   
		
		Scanner lerDados = new Scanner(System.in);
		Scanner lerCtrlParada = new Scanner(System.in);
		CalculaMedia cMedia = new CalculaMedia(); //instanciando o Objeto CalculaMedia
		Status status = new Status(); //instanciando o Objeto Status
				
		while(ctrlParada.equals("S")) {
			System.out.println("** "+cont+"a. COLETA **\n");
			System.out.printf("1a.NOTA: ");
			n01 = lerDados.nextDouble();
			System.out.printf("2a.NOTA: ");
			n02 = lerDados.nextDouble();
			System.out.printf("3a.NOTA: ");
			n03 = lerDados.nextDouble();
			System.out.printf("4a.NOTA: ");
			n04 = lerDados.nextDouble();
			m = cMedia.CalculaMedia(n01, n02, n03, n04);//utilzando o Objeto CalculaMedia
			System.out.printf("\nMÉDIA: %.2f", m);
			
			if(m < 7) {
				System.out.println(" ==>> " + status.Status(m));//utilzando o Objeto CalculaMedia
			}else {
				System.out.println(" ==>> " + status.Status(m));//utilzando o Objeto CalculaMedia
			}
			
			System.out.printf("\nContinuar... S/N ? ");
			ctrlParada = lerCtrlParada.nextLine();
			cont++;
		}
		System.out.println("\n\nOBRIGADO!!!");
		lerDados.close();
		lerCtrlParada.close();
	}
}