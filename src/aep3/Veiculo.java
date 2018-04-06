package aep3;

public class Veiculo {
	protected String nome;
	protected String chassi;
	protected String marca;
        protected String modelo;
        protected int anoFab;
	
	public Veiculo(String nome, String chassi, String marca, String modelo, int anoFab ) {
		super();
		this.nome = nome;
		this.chassi = chassi;
		this.marca = marca;
                this.modelo = modelo;
                this.anoFab = anoFab;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
        public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
        public int getAnoFab() {
		return anoFab;
	}

	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}
        
}
