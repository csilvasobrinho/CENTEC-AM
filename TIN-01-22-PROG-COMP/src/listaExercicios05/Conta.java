package listaExercicios05;

public class Conta {
	String nomeTitular = "Manoel";
	int numeroConta;
	String agencia;
	double saldo;
	Data dataAbertura;
	
	void sacar(double valor) {
		
	}
	void depositar(double valor) {
		
	}
	void calcularRedimento(double valor) {
		
	}
	String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.nomeTitular;
		dados +="\nData: " + this.dataAbertura.dia + "/";
		dados += this.dataAbertura.mes + "/";
		dados += this.dataAbertura.ano;
		
		return dados;
	}
}