
package Exercicio04;
//import Exercicio03.ControleRemoto;
//import Exercicio03.* importa todas as classes;

public class Contador {
    private int valor;
    private int limite;
    
    public Contador(int limite) { //Método Construtor
        //this.limite = limite;
        //this.valor = 0; //começa em zero
        this(0, limite);
    }
    
    public Contador(int valor, int limite){
       this.limite = limite;
       this.valor = valor; 
    }
    
    public void incrementar(){
        valor++;
        if (valor == limite){
            valor = 0;
        }
    }
        
    public int devolveValor(){
        return valor;
    }
    
    public String devolveString(){ //? significa if : else
        return (valor < 10) ?    "0" + valor  :  "" + valor;
        
    }
    
    public void alterarValor(int valor){
            if(valor >= 0 && valor < limite)
                this.valor = valor;
    }
    
}
