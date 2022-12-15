public class Figurinhas {
	private int qtd[] = new int[640]; // Quantidade de figurinhas
	private String selecao[] = new String[640]; // Salva a string com index
	private int colecao[][] = new int[640][2]; // Salva o index na coluna 1 e a quantidade de cada figurinha na coluna 2

	// Constructors
	Figurinhas() {

	}

	Figurinhas(int newQtd[], String[] newSelecao) {
		this.selecao = newSelecao;
		this.qtd = newQtd;
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
	public void printA() { // Metodo para printar o index e a quantidade de cada selecao
		for (int i = 0; i < colecao.length; i++) {
			System.out.println(this.selecao[i] + "; " + this.colecao[i][1]);
		}
	}

	public void addQtd(int albumP[][], int albumA[][], int i, int cont) {
		albumP[i][1] += 1;
		albumA[i][1] -= 1;
		cont += 1;
	}

	public void dimQtd(int albumP[][], int albumA[][], int i, int cont) {
		albumP[i][1] -= 1;
		albumA[i][1] += 1;
		cont += 1;
	}

	/*
	 * Metodo de trocas das figurinhas, verifica se a nossa quantidade e 0 e a do
	 * amigo 1, caso seja, efetua a troca e adiciona um valor para o contador Faz o
	 * mesmo mas para o amigo, tendo assim a troca 1:1
	 */

	public void troca(Figurinhas cp, Figurinhas ca, int trocasMax) {
		int albumP[][], albumA[][];
		int contR = 0;
		int contD = 0;
		albumP = new int[qtd.length][2];
		albumA = new int[qtd.length][2];

		albumP = cp.getColecao();
		albumA = ca.getColecao();
		for (int i = 0; i < qtd.length; i++) {
			if (albumP[i][1] == 0 && albumA[i][1] > 1) {
				albumP[i][1] += 1;
				albumA[i][1] -= 1;
				contR += 1;
				System.out.println("Recebi: " + this.selecao[i]);
			} else if (albumP[i][1] > 1 && albumA[i][1] == 0) {
				albumP[i][1] -= 1;
				albumA[i][1] += 1;
				contD += 1;
				if (contR != contD) {
					continue;
				}
				System.out.println("Dei: " + this.selecao[i]);
			}
		}
		for (int i = 0; i < qtd.length; i++) {
			if (albumP[i][1] == 0) {
				System.out.println("Cartas que faltam: " + this.selecao[i]);
			}
		}
		System.out.println("Recebi " + contR);
		System.out.println("Dei " + contD);

	}
}
