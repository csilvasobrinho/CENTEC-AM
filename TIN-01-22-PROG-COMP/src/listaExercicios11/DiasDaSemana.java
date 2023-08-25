package listaExercicios11;

public class DiasDaSemana {
	Dias diaDaSemana;
	
	public static void main(String[] args) {
		DiasDaSemana dia = new DiasDaSemana();
		dia.diaDaSemana = Dias.SEGUNDA;
		
		System.out.println(dia.diaDaSemana);
		System.out.println(dia.diaDaSemana.valorDia);
		
	}

}
