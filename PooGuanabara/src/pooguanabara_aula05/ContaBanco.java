package pooguanabara_aula05;

public class ContaBanco {
	
	public int numConta;
	private String dono;
	protected String tipo; // cc - conta corrente ganha 50 p/ abrir e cp - conta poupança ganha 150 p/ abrir
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("------------------------ ");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println("Conta: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	
	//metodo construtor
	
	public ContaBanco() {
		this.setSaldo(0);;
		this.setStatus(false);;				
	}
	
	// Status
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if ("CC".equalsIgnoreCase(tipo)) {    // ou (tipo == "CC")
			//this.saldo = 50;
			this.setSaldo(50);
		} else if ("CP".equalsIgnoreCase(tipo)) {
			//this.saldo = 150;
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("A conta possui dinheiro, não é possível fechar");
		} else if(this.getSaldo() < 0) {
			System.out.println("A conta está negativa, não é possível fechar");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
			
	// depositar e sacar
	
	public void depositar(double valor) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.print("Deposito realizado na conta de: " + this.getDono());
		} else {
			System.out.print("Não é possível depositar, conta fechada!");
		}
	}
	
	public void sacar(double valor) {
		if (this.getStatus() == true) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.print("Saque realizado na conta de: " + this.getDono());
			} else {
				System.out.print("Saldo insuficiente!");
			}
		} else {
			System.out.print("Não é possível sacar, conta fechada!");
		}
	}
	
	//pagar mensalidade valor 12 cc e 20 cp
	
	public void pagarMensalidade() {
		double mensalidade = 0;
		if("CC".equalsIgnoreCase(tipo)) {
			mensalidade = 12;
		} else if ("CP".equalsIgnoreCase(tipo)) {
			mensalidade = 20;
		}
		if (getStatus() == true) {
			if(getSaldo() > mensalidade) {
				setSaldo(getSaldo() - mensalidade);
				System.out.print("Mensalidade paga por: " + this.getDono());
			}else {
				System.out.print("Saldo insuficiente!");
			}
		} else {
			System.out.print("Não é possível pagar");
		}
			
	}
		
	//Getters and Setters de cada atributo
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	

}
