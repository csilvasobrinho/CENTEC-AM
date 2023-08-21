package SettersEGetters;

public class ExemploGetESet01 {
	private int numero;
	
	public void setNumero(int valorInteiro) {
		if(valorInteiro <1 || valorInteiro >10) {
			throw new IllegalArgumentException();
		}
		this.numero = valorInteiro;
	}

	public int getNumero() {
		return numero;
	}
}