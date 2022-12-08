public class Figurinhas {
	private int qtd[] = new int[400];
	private String selecao[] = new String[400];

	// Constructors
	Figurinhas(int newQtd[], String[] newSelecao) {
		
			this.selecao = newSelecao;
			this.qtd = newQtd;
	}

	// Setters & Getters
	public int[] getQtd() {
		return this.qtd;
	}

	public void setQtd(int newQtd[]) {
			this.qtd = newQtd;
	}

	public String[] getSelecao() {
		return this.selecao;
	}

	public void setSelecao(String[] newSelecao) {
			this.selecao = newSelecao;
	}

	public void printC() {
		int cont = 1;
		for (int i = 0; i < 40; i++) {
			System.out.println(this.selecao[i] + "; " + this.qtd[i]);
//			System.out.println(cont);
			cont += 1;
		}
	}
}
