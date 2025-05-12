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
        if(saldo < valor){
           saldo = saldo + limite;
           saldo = saldo - valor;
           limite = 0; //tem que mudar isso ae
           return true;
        }
        else
          return false;
    }

    void imprimeDono(){
        System.out.println("Dono:" + dono);
    }

    double devolveSaldo(){
        return saldo;
    }

    boolean transferePara(double quantidade, SistBancBasico destino){
        if(saca(quantidade)){
            destino.deposita(quantidade);
            return true;
        }
        return false;
    }

    void imprimeDados(){
        System.out.print("Número: " + numero + "\n");
        System.out.print("Dono: " + saldo + "\n");
        System.out.print("Saldo: " + saldo + "\n");
        System.out.print("Limite: " + limite + "\n");

    }

    public static void main(String[] args){
        
        SistBancBasico maria, carlinhos; //instanciando o objeto, é aqui que vamos testar se tudo funciona;
       
        maria = new SistBancBasico();
        carlinhos = new SistBancBasico();

        maria.numero = 123;
        maria.dono = "Maria Silva";
        maria.saldo = 1000;
        maria.limite = 500;        


        carlinhos.numero = 250;
        carlinhos.dono = "Carlinhos Teixeira";

        //Aqui começa as operações~
        System.out.println("DADOS DA CONTA:");
        maria.imprimeDados();
        
        System.out.println("\n" + "Depositando R$200 na conta de Maria...");
            maria.deposita(200);
        System.out.println("Novo saldo: " + maria.devolveSaldo() + "\n");
        
        System.out.println("Sacando R$1500,00 da conta de Maria...");
            if(maria.saca(1500)){
                System.out.println("Saque realizado");
            }
            else
              System.out.println("Saldo Insuficiente!");
        
            System.out.println("Saldo atual: R$" + maria.devolveSaldo() + "\n"); //aqui deveria ser 200?
            
            System.out.println("Transferindo R$300 para Carlinhos...");
                if( maria.transferePara(300, carlinhos) ){
                    System.out.println("Transferência Realizada!" + "\n");
                }
                else
                    System.out.println("Saldo Insuficiente!" + "\n");
                
            System.out.println("Saldo final das contas: ");
            System.out.println("Conta 1 - Saldo: " + maria.devolveSaldo());
            System.out.println("Conta 2 - Saldo: " + carlinhos.devolveSaldo());
        }
   
    }
