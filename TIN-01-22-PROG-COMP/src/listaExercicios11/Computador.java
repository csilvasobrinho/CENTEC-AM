package listaExercicios11;

public class Computador {
	ModeloPC modelo;
	public static void main(String[] args) {
		Computador computador = new Computador();
		computador.modelo = ModeloPC.SAMSUNG;
		
		System.out.println("Modelo do PC: "
				+ computador.modelo);
	}
}
