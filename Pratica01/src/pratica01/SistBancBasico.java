/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica01;

/**
 *
 * @author mysterubuntu
 */
public class SistBancBasico {
    
// Atributos
    int numero;
    String dono;
    double saldo;
    double limite;

    // Métodos
    void deposita(double quantidade) {
        saldo = saldo + quantidade;
    }
    
    boolean saca(double valor) {
        if (saldo < valor) { //pro desafio é só trocar saldo + limite < valor
            return false;
        } else {
            saldo = saldo - valor;
            return true;
        }
    }

    void imprimeDono(String dono){
        System.out.println("Dono:" + dono);
    }

    void devolveSaldo(double saldo){
        return saldo;
    }

    transferePara(SistBancBasico destino, double quantidade){
        if(saca(quantidade)){
            destino.deposita(quantidade);
            return true;
        }
        return false;
    }

    void imprimeDados(){
        System.out.print("Número: " + numero);
        System.out.print("Dono: " + saldo);
        System.out.print("Saldo: " + saldo);
        System.out.print("Limite: " + limite + "\n");

    }

    public static void main(String[] args){
        SistBancBasico maria, joao; //instanciando o objeto, é aqui que vamos testar se tudo funciona;
       
        maria = new SistBancBasico();
        joao = new SistBancBasico();

        maria.dono = "Maria";
        maria.saldo = 1000;

        maria.deposita(200);
        System.out.println("Dono: " + maria.dono);
        System.out.println("Saldo: " + maria.saldo); //sout tab faz automaticamente essa linha
    }
        
    }
