package excecoes05.Atividades;

class MinhaExcecao extends Exception {
	
}

public class TesteExcecao {
	public static void teste() throws MinhaExcecao {
		throw new MinhaExcecao();
	}

	public static void main(String[] args) throws MinhaExcecao {
		MinhaExcecao me = null;
		try {
			System.out.println("try ");
               teste();
		} catch (MinhaExcecao e) {
			System.out.println("catch ");
			me = e;
		} finally {
			System.out.println("finally ");
			throw me;
		}

		//System.out.println("fim");
	}
}