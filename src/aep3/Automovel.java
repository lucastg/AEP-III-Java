package aep3;

public class Automovel extends Veiculo{
    private int qntdPortas;
    private String tipoCombustivel;
    
    public  Automovel (String nome,String chassi, String marca, String modelo, int anoFab, int qntdPortas, String tipoCombustivel){
        super (nome, chassi, marca, modelo, anoFab);
        this.qntdPortas =qntdPortas;
        this.tipoCombustivel=tipoCombustivel;
    }
    public int getqntdPortas(){
        return qntdPortas;
    }
    public void setqntdPortas(){
        this.qntdPortas=qntdPortas;
    }
    public String gettipoCombustivel(){
        return tipoCombustivel;
    }
    public void settipoCombustivel(){
        this.tipoCombustivel=tipoCombustivel;
    }
    
}
