package Classes;

public class Pessoa {
    
    //Atributos
    float peso;
    float altura;
    
    public float calcularIMC(){
        
        float imc = peso / (peso * altura);
        return imc;
    }
    
}
