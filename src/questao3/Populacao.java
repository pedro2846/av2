package questao3;

public class Populacao {
	String sexo;
	String olhos;
	String cabelos;
	int idade;

	public Populacao() {
		
	}

	@Override
	public String toString() {
		return "Sexo " + sexo + "\tOlhos: " +olhos+ "\tCabelos: " + cabelos +"\tIdade: "+ idade;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getOlhos() {
		return olhos;
	}

	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}

	public void setCabelos(String cabelos) {
		this.cabelos = cabelos;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
