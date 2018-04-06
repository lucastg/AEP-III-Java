package aep3;

public class Motocicleta extends Veiculo{
    private int cilindrada;
    private String tipo;
    
    public  Motocicleta (String nome,String chassi, String marca, String modelo, int anoFab, int cilindrada, String tipo){
        super (nome, chassi, marca, modelo, anoFab);
        this.cilindrada =cilindrada;
        this.tipo=tipo;
    }
    public int getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(){
        this.cilindrada=cilindrada;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(){
        this.tipo=tipo;
    }
    
}
