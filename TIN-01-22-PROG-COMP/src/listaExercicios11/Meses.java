package listaExercicios11;
public class Meses {
	
	MesesDoAno x;
	
	public static void main(String[] args) {
		Meses mes = new Meses();
		
		System.out.println("Mês Atual: "
				+ mes.x.SETEMBRO + " (" 
				+ mes.x.SETEMBRO.numMes
				+ ")");
		
		System.out.println("Mês Meu Niver: "
				+ mes.x.JULHO 
				+ " (" 
				+ mes.x.JULHO.numMes+ ")");
	}
}
