package enumeracao.declaracao;

public class ClasseTesteEnum {
	Planetas planeta;
	
	ClasseTesteEnum(String planeta){
		this.planeta = Planetas.valueOf(planeta);
	}
	
	public void viajarPlaneta() {
		switch(planeta) {
		case MERCURIO:
			System.out.println("Muito quente em Mercúrio");
			break;
		case TERRA:
			System.out.println("Muito Verde é Água na Terra!");
			break;
		case URANO:
			System.out.println("URANO é muito longe...");
			break;
		default:
			System.out.println("Passagens esgotadas!");
		}
	}

}
