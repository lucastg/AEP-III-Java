package aep3;

import java.util.ArrayList;
import aep3.Veiculo;

public class ControlaVeiculo {

    private ArrayList<Veiculo> lista;

    public ControlaVeiculo() {
        lista = new ArrayList<Veiculo>();
    }

    public void inserirAutomovel(Veiculo v) {
        lista.add(v);
    }

    public void inserirMotocicleta(Veiculo v) {
        lista.add(v);
    }

    public void inserirCaminhao(Veiculo v) {
        lista.add(v);
    }

    public void exibirTodos() {
        if (lista != null && lista.size() > 0) {
            for (Veiculo v : lista) {
                if (v instanceof Automovel) {
                    System.out.println("-AUTOMOVEL-");
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Chassi: " + v.getChassi());
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Ano de Fabricação: " + v.getAnoFab());
                    System.out.println("Quantidade de Portas: " + ((Automovel) v).getqntdPortas());
                    System.out.println("Tipo de Combustivel: " + ((Automovel) v).gettipoCombustivel());

                } else if (v instanceof Motocicleta) {
                    System.out.println("-MOTOCICLETA-");
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Chassi: " + v.getChassi());
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Ano de Fabricação: " + v.getAnoFab());
                    System.out.println("Cilindrada: " + ((Motocicleta) v).getCilindrada());
                    System.out.println("Tipo: " + ((Motocicleta) v).getTipo());
                } else if (v instanceof Caminhao) {
                    System.out.println("-CAMINHAO-");
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Chassi: " + v.getChassi());
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Ano de Fabricação: " + v.getAnoFab());
                    System.out.println("Peso: " + ((Caminhao) v).getPeso());
                    System.out.println("Carga: " + ((Caminhao) v).getCarga());
                }

            }
        } else {
            System.out.println("Lista Vazia!");
        }
    }

    public void pesquisar(String placa) {
        for (Veiculo v : lista) {
            if (v.getPlaca().equals(placa)) {
                if (v instanceof Automovel) {
                    System.out.println("-AUTOMOVEL-");
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Chassi: " + v.getChassi());
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Ano de Fabricação: " + v.getAnoFab());
                    System.out.println("Quantidade de Portas: " + ((Automovel) v).getqntdPortas());
                    System.out.println("Tipo de Combustivel: " + ((Automovel) v).gettipoCombustivel());

                } else if (v instanceof Motocicleta) {
                    System.out.println("-MOTOCICLETA-");
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Chassi: " + v.getChassi());
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Ano de Fabricação: " + v.getAnoFab());
                    System.out.println("Cilindrada: " + ((Motocicleta) v).getCilindrada());
                    System.out.println("Tipo: " + ((Motocicleta) v).getTipo());
                } else if (v instanceof Caminhao) {
                    System.out.println("-CAMINHAO-");
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Chassi: " + v.getChassi());
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Ano de Fabricação: " + v.getAnoFab());
                    System.out.println("Peso: " + ((Caminhao) v).getPeso());
                    System.out.println("Carga: " + ((Caminhao) v).getCarga());
                }
            }
        }

    }
}
