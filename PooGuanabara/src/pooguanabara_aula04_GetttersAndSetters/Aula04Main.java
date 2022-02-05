package pooguanabara_aula04_GetttersAndSetters;

public class Aula04Main {

	public static void main(String[] args) {
		CanetaClass c1 = new CanetaClass("Nic", "Amarela",0.4f);
		/* c1.setModelo("Bic");
		c1.setPonta(0.5f);
		System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());*/		
		c1.status();
		
		CanetaClass c2 = new CanetaClass("Faber","Rosa", 0.7f);
		c2.status();
		
	}

}
