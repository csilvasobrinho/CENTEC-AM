package listaExercicios05;

public class TestarConta {
	public static void main(String[] args) {
		Conta contaCleverson; contaCleverson = new Conta();
		Data dataAbertura; dataAbertura = new Data();
		contaCleverson.nomeTitular = "Danilo";
		contaCleverson.saldo = 1000;
		contaCleverson.dataAbertura = dataAbertura;

		contaCleverson.sacar(250);

		System.out.println(contaCleverson.recuperaDadosParaImpressao());

	}
}
