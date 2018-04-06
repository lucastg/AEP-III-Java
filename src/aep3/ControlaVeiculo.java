package aep3;
import java.util.ArrayList;
import aep3.Veiculo;


public class ControlaVeiculo {
    private ArrayList<Veiculo>lista;
    
    public ControlaVeiculo(){
        lista= new ArrayList<Veiculo>();
    }
    public void inserirAutomovel(Veiculo v){
        lista.add(v);
    }
    public void inserirMotocicleta(Veiculo v){
        lista.add(v);
    }
    public void inserirCaminhao(Veiculo v){
        lista.add(v);
    }
    
    public void exibirTodos(){
		if(lista != null && lista.size() > 0){
			for(Veiculo v : lista){
				System.out.println("Nome: " + v.getNome());
			}
		}else
			System.out.println("Lista Vazia!!!");
	}
}
