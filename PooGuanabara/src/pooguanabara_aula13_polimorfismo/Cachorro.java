package pooguanabara_aula13_polimorfismo;

public class Cachorro extends Lobo{

    @Override
    public void emitirSom(){
        System.out.println("au, au, au");
    }
    
    public void reagir (String frase){
        if(frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("Olá")){
            System.out.println("Abanar o rabo e latir");
        } else {
            System.out.println("rosnar");
        }
    }

    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar o rabo");
        } else if (hora >= 18){
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanar o rabo e latir");
        }
    }

    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("rosnar");
        } 
    }

    public void reagir(int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("Abanar o rabo");
            } else {
                System.out.println("Latir");
            }
        } else if (peso < 10){
            System.out.println("Rosnar");
        } else {
            System.out.println("Ignorar");
        } 
    }
    
}

