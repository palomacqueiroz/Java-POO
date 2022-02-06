package pooguanabara_aula13_polimorfismo;

public class Mamifero extends Animal{

    private String corPelo;

    //Sobrescrever.
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }

    // Getters and Setters.
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
