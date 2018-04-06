package aep3;

import java.util.Scanner;

public class TelaVeiculo {
    
    Scanner scan = new Scanner(System.in);
    public int menu(){
        System.out.println("______Menu______");
        System.out.println("0 - opcoes");
        int opcao = scan.nextInt();
        return opcao;
    }
    
}
