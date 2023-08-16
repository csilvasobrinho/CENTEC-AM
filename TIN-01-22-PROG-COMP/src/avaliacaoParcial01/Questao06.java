package avaliacaoParcial01;
public class Questao06 {
	public static void main(String[] args) {
		int i = 0, cont = 0;
		i = 15;
		if(i <= 10) {
			cont = 1;
			while(cont <= 10) {
				System.out.println(cont + "o.");
				cont++;
			}
		}else {
			cont = 10;
			while(cont >= 1) {
				System.out.println(cont + "o.");
				cont--;
			}
		}
	}
}

