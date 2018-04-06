package aep3;

import java.util.Scanner;

import aep3.Automovel;
import aep3.ControlaVeiculo;
import aep3.Motocicleta;
import aep3.TelaVeiculo;
import aep3.Veiculo;
import aep3.ViewVeiculo;


public class AppVeiculo {
    
    public static void main(String[] args) {

		ViewVeiculo view = new ViewVeiculo();
                ControlaVeiculo controla = new ControlaVeiculo();
		Scanner scan = new Scanner(System.in);
		
		int opcao = 0;
		
		while(opcao != 5){
			System.out.println("Selecione uma Opção:");
			System.out.println("1 - Listar");
			System.out.println("2 - Inserir Automovel");
			System.out.println("3 - Inserir Motocicleta");
			System.out.println("4 - Inserir Caminhao");
			System.out.println("5 - Pesquisar por placa");
			
			opcao = scan.nextInt();
			
			switch(opcao){
				case 1: 
					controla.exibirTodos();
					break;
				case 2:
					view.carregarAutomovel();
					break;
				case 3:
					view.carregarMotocicleta();
					break;
				case 4:
					view.carregarCaminhao();
					break;
				case 5:
			}
		}		
	}
    
}

