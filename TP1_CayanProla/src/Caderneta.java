import java.util.Arrays;

public class Caderneta {

	private String selecao;

	Caderneta() {
	}
	Caderneta(String selecao) {
			this.selecao = selecao;
	}

	// Setters & Getters
	public String getSelecao() {
		return this.selecao;
	}

	public void setSelecao(String selecao) {
		this.selecao = selecao;
	}

	// comparar cadernetas

	public  void printC(Caderneta c) {
		for (int i = 0; i <4; i++) {
			System.out.println();
		}

	}

}