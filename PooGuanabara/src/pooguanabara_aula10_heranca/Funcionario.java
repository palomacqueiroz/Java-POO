package pooguanabara_aula10_heranca;

public class Funcionario extends Pessoa {
	
	private String setor;
	private boolean trabalhando;
	
	//metodo
	
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}
	
	
	// G e S
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public boolean getTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	

}
