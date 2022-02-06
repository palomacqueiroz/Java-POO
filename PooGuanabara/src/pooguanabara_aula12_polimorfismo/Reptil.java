package pooguanabara_aula12_polimorfismo;

public class Reptil extends Animal{
    protected String corEscama;

    //Sobrescrever.
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo folhas");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }

    // Getters and Setters.
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
