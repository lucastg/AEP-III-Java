package aep3;

import java.util.Scanner;

public class TelaVeiculo {

    public int menu() {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        System.out.println("-MENU-");
        System.out.println("1 - Listar");
        System.out.println("2 - Inserir Automovel");
        System.out.println("3 - Inserir Motocicleta");
        System.out.println("4 - Inserir Caminhao");
        System.out.println("5 - Pesquisar por placa");
        System.out.println("6 - Sair");
        opcao = scan.nextInt();
        return opcao;

    }
}
