package avaliacaoParcial02.questao08;
public class Status {
	public String Status(double m) {
		String status;
		if(m < 7) {
			status = "Reprovado!";
		}else {
			status = "Aprovado!";
		}
		return status;
	}
}