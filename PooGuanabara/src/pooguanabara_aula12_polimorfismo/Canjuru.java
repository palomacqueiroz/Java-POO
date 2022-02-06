package pooguanabara_aula12_polimorfismo;

public class Canjuru extends Mamifero{

    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
}
