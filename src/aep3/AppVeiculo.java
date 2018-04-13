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

        Scanner scan = new Scanner(System.in);
        TelaVeiculo tela = new TelaVeiculo();
        boolean aux = true;

        while (aux == true) {

            switch (tela.menu()) {
                case 1:
                    view.exibirTodos();
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
                    view.pesquisar();
                    break;
                case 6:
                    aux = false;
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }
    }
}
