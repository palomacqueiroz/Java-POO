package pooguanabara_aula04_GetttersAndSetters;

public class CanetaClass {

	public String modelo, cor;
	private float ponta;
	private boolean tampada;
	
	/* public CanetaClass() { // método construtor
		this.tampar();
		this.cor = "Azul";
	} */
	
	public CanetaClass(String modelo, String cor, float ponta) { // método construtor
		this.modelo = modelo;
		this.cor = cor;
		this.setPonta(ponta);
		this.tampar();
		
	} 
	
	public String getModelo() {
		return this.modelo;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Tampada: " + this.tampada);
		
	}

	
	
	
}
