


package Exercicio04;

public class RelogioDigital { // O relogio é COMPOSTO por Contadores
    private Contador minutos;
    private Contador horas;
    
    public RelogioDigital(){ //Metodo Construtor
        minutos = new Contador(60); //limite é 60
        horas = new Contador(24); //limite é 24
    }
    
    public RelogioDigital(int hora, int minuto){
        minutos = new Contador(minuto, 60);
        horas = new Contador(hora, 24);
    }
    
    public void atualizaVisor(){
        System.out.println
        (horas.devolveString() + ":" + minutos.devolveString());
    }
    
    public void eventoDoVisor(){
        minutos.incrementar();
        if(minutos.devolveValor() == 0)
            horas.incrementar();
    }
    public void alterarHora(int hora){
        horas.alterarValor(hora);
    }
     public void alterarMinuto(int minuto){
        horas.alterarValor(minuto);
     }
}