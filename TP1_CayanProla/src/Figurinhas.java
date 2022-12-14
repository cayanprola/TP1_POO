public class Figurinhas {
	private int qtd[] = new int[640]; // Quantidade de figs
	private String selecao[] = new String[640]; // Salva a string com index
	private int colecao[][] = new int[640][2]; // Salva o index na coluna 1 e a quantidade de cada figurinha na coluna 2

	// Constructors
	Figurinhas() {

	}

	Figurinhas(int newQtd[], String[] newSelecao, int newColecao[][]) {
		this.colecao = newColecao;
		this.selecao = newSelecao;
		this.qtd = newQtd;
	}

	// Setters & Getters

	// Getters
	public int[] getQtd() {
		return this.qtd;
	}

	public String[] getSelecao() {
		return this.selecao;
	}

	public int[][] getColecao() {
		return this.colecao;
	}

	// Setters
	public void setQtd(int newQtd[]) {
		this.qtd = newQtd;
	}

	public void setColecao(int newColecao[][]) {
		this.colecao = newColecao;
	}

	public void setSelecao(String[] newSelecao) {
		this.selecao = newSelecao;
	}

	// Methods
	public void printA() { // Metodo para printar o index e a quantidade de cada selecao, usado para
							// efetuar as trocas
		for (int i = 0; i < colecao.length; i++) {
			System.out.println(this.selecao[i] + "; " + this.colecao[i][1]);
		}

	}

	public void printC() { // Metodo que printa a string, o index e a selecao
		int cont = 1;
		for (int i = 0; i < selecao.length; i++) {
			System.out.println(this.selecao[i] + "; " + this.qtd[i]);
//			System.out.println(cont);
			cont += 1;
		}
	}

	// Metodos para adicionar e remover figurinhas,
}
