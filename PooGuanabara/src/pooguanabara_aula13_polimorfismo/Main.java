package pooguanabara_aula13_polimorfismo;

public class Main {
    public static void main(String[] args) {
    Mamifero m = new Mamifero();
    Lobo l = new Lobo();
    Cachorro c = new Cachorro();

    l.emitirSom();
    m.emitirSom();
    
    c.reagir("Olá");
    c.reagir("Vai Apanhar");
    c.reagir(11,45);
    c.reagir(21,00);
    c.reagir(false);
    c.reagir(true);
    c.reagir(2, 12.5f);
    c.reagir(17, 4.5f); 
    

    }
    
}
