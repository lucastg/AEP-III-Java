package aep3;
import aep3.ControlaVeiculo;
import aep3.Automovel;
import java.util.Scanner;
import aep3.Motocicleta;
import aep3.Veiculo;

public class ViewVeiculo {
    private ControlaVeiculo control;
    
    public ViewVeiculo(){
        control = new ControlaVeiculo();
    }
    
    public void carregarAutomovel(){
        //Solicitar dados do veiculo
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do automovel: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o chassi do automovel: ");
		String chassi = scan.nextLine();
		
		System.out.println("Digite a marca do automovel: ");
		String marca = scan.nextLine();
		
		System.out.println("Digite o modelo do automovel: ");
		String modelo = scan.nextLine();
		
		System.out.println("Digite o ano de fabricacao do automovel: ");
		int anoFab = scan.nextInt();
                
                System.out.println("Digite a quantidade de portas do automovel: ");
		int qntdPortas = scan.nextInt();
                
                System.out.println("Digite o tipo do combustivel do automovel: ");
		String tipoCombustivel = scan.nextLine();
                
		//Instanciar um objeto Veiculo
		Veiculo v = new Automovel (nome, chassi, marca, modelo, anoFab, qntdPortas, tipoCombustivel);
		
		//Chamar na control, o mÃ©todo inserir
		control.inserirAutomovel(v);

    }
    
       public void carregarMotocicleta(){
        //Solicitar dados do veiculo
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da motocicleta: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o chassi da motocicleta: ");
		String chassi = scan.nextLine();
		
		System.out.println("Digite a marca da motocicleta: ");
		String marca = scan.nextLine();
		
		System.out.println("Digite o modelo da motocicleta: ");
		String modelo = scan.nextLine();
		
		System.out.println("Digite o ano de fabricacao da motocicleta: ");
		int anoFab = scan.nextInt();
                
                System.out.println("Digite a cilindrada do motoclicleta: ");
		int cilindrada = scan.nextInt();
                
                System.out.println("Digite o tipo da motocicleta: ");
		String tipo = scan.nextLine();
                
		//Instanciar um objeto Veiculo
		Veiculo v = new Motocicleta (nome, chassi, marca, modelo, anoFab, cilindrada, tipo);
		
		//Chamar na control, o mÃ©todo inserir
		control.inserirMotocicleta(v);

    }
       
       public void carregarCaminhao(){
        //Solicitar dados do veiculo
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do caminhao: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o chassi do caminhao: ");
		String chassi = scan.nextLine();
		
		System.out.println("Digite a marca do caminhao: ");
		String marca = scan.nextLine();
		
		System.out.println("Digite o modelo do caminhao: ");
		String modelo = scan.nextLine();
		
		System.out.println("Digite o ano de fabricacao do caminhao: ");
		int anoFab = scan.nextInt();
                
                System.out.println("Digite o peso do caminhao: ");
		int peso = scan.nextInt();
                
                System.out.println("Digite a carga do caminhao: ");
		String cara = scan.nextLine();
                
		//Instanciar um objeto Veiculo
		Veiculo v = new Motocicleta (nome, chassi, marca, modelo, anoFab, peso, cara);
		
		//Chamar na control, o mÃ©todo inserir
		control.inserirMotocicleta(v);

    }
    
    
}
