package enumeracao.declaracao;
public enum Periodos {
	MANHA("O que está dentro da Manhã"),
	TARDE("Tarde"),
	NOITE("Noite");
	
	private String descricao;
	
	Periodos(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}