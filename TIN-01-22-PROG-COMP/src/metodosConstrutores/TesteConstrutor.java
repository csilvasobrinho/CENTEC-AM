package metodosConstrutores;
/*
 * Classe utilizada para demonstrar o uso do construtor.
 */
public class TesteConstrutor {
	/**
	 * Método principal que cria dois objetos.
	 */
	public static void main(String[] args) {
		/* Chama o construtor padrão da classe ClasseConstrutor. */
		ClasseConstrutor cc = new ClasseConstrutor();
		/*
		 * Chama o construtor da classe ClasseConstrutor2 passando os valores que serão
		 * guardados nos atributos.
		 */
		ClasseConstrutor2 cc2 = new ClasseConstrutor2(10, 3.5F, false);
	}
}