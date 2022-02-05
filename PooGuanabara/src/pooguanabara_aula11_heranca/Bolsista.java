package pooguanabara_aula11_heranca;

public class Bolsista extends Aluno {
	
	private float bolsa;
	
	// Método
	
	public void renovarBolsa() {
		System.out.println("Renovando a bolsa de: " + this.nome);
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println( this.nome + " é bolsista! Pagamento facilitado.");		
	}	
	
	// G e S

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	

}
