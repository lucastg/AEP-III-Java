package aep3;

public class Caminhao extends Veiculo{
    private int peso;
    private String carga;
    
    public  Caminhao (String nome,String chassi, String marca, String modelo, int anoFab, int peso, String carga){
        super (nome, chassi, marca, modelo, anoFab);
        this.peso =peso;
        this.carga=carga;
    }
    public int getPeso(){
        return peso;
    }
    public void setPeso(){
        this.peso=peso;
    }
    public String getCarga(){
        return carga;
    }
    public void setCarga(){
        this.carga=carga;
    }
    
}