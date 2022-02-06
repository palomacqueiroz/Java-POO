package pooguanabara_aula12_polimorfismo;

public class Reptil extends Animal{
    private String corEscama;

    //Sobrescrever.
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo vegetais");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de réptil");
    }

    // Getters and Setters.
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
