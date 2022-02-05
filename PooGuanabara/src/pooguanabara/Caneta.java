package pooguanabara;

public class Caneta {

		public String modelo, cor;
		private float ponta;
		protected int carga;
		private boolean tampada;
		
		public void status() {
			System.out.println("Modelo " + this.modelo);
			System.out.println("Uma caneta " + this.cor);
			System.out.println("Ponta: " + this.ponta);
			System.out.println("Carga: " + this.carga);
			System.out.println("Está tampada? " + this.tampada);
		}
		
		public void rabiscar() {
			if(this.tampada == true) {
				System.out.println("Erro! não posso rabiscar.");
			} else {
				System.out.println("Estou rabiscando.");
			}
		}
		
		public void tampar() {
			this.tampada = true;
					
		}
		
		public void destampar() {
			this.tampada = false;
			
		}
	

}
