package pooguanabara_aula12_polimorfismo;

public class Ave extends Animal{
    protected String corPena;

    //Metodo.
    public void fazerNinho(){
        
    }

    //Sobrescrever.
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }

    // Getters and Setters.
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
