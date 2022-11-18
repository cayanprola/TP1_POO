
public class Caderneta {
	private String[] selecao;
//	private int index;

	Caderneta(String[] selecao) {
		for (int i = 0; i < selecao.length; i++) {
			this.selecao[i] = selecao[i];
		}
	}

	// Setters & Getters
	public String[] getSelecao() {
		return this.selecao;
	}

	public void setSelecao(String[] selecao) {
		this.selecao = selecao;
	}

//	public int getIndex() {
//		return this.index;
//	}
//
//	public void setIndex(int index) {
//		this.index = index;
//	}

	// comparar cadernetas

	void printC(String[] selecao) {
		for (int i = 0; i < selecao.length; i++) {
			System.out.println(selecao[i] + "; ");
		}

	}
}
