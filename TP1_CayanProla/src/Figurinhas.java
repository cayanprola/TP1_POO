
public class Figurinhas {
	private int qtd[] = new int[640]; // Quantidade de figurinhas
	private String selecao[] = new String[640]; // Salva a string com index
	private int colecao[][] = new int[640][2]; // Salva o index na coluna 1 e a quantidade de cada figurinha na coluna 2

	// Constructors
	Figurinhas () {
		
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

	/*
	 * Verifica quantas figurinhas faltam e faz print
	 */
	public void falta(Figurinhas fp) {
		int albumP[][];
		albumP = new int[qtd.length][2];
		albumP = fp.getColecao();
		for (int i = 0; i < qtd.length; i++) {
			if (albumP[i][1] == 0) {
				System.out.println("Cartas que faltam: " + this.selecao[i]);
			}
		}
	}

	public void check(int contR, int contD) { // Verifica se nao falta mais nenhuma figurinha
		if (contR == 0 || contR == contD) {
			System.out.println("Parabéns, não falta nenhuma figurinha.");
			System.exit(1);
		}
	}
	/*
	 * Metodo de trocas das figurinhas, verifica se a nossa quantidade e 0 e a do
	 * amigo 1, caso seja, efetua a troca e adiciona um valor para o contador e tambem faz o
	 * mesmo para o amigo, tendo assim a troca 1:1 Uso de ifs para prevenir um
	 * numero maior de trocas
	 */

	public void troca(Figurinhas fp, Figurinhas fa, int k, int trocasMax) {
		int albumP[][], albumA[][];
		int contR = 0, contD = 0;
		/*
		 * Contador de figurinhas recebidas e dadas Usado para a verificaçao de 1:1
		 */

		albumP = new int[qtd.length][2];
		albumA = new int[qtd.length][2];
		albumP = fp.getColecao();
		albumA = fa.getColecao();

		for (int i = 0; i < qtd.length; i++) {
			if (albumP[i][1] == 0 && albumA[i][1] > 1) {
				albumP[i][1] += 1;
				albumA[i][1] -= 1;
				contR += 1;
				if (contR == contD || contR == Main.darSort[k]) {// Chama o valor darSort do main
					System.out.println("Recebi : " + this.selecao[i]);
					break;
				}
				System.out.println("Recebi: " + this.selecao[i]);
			}
		}
		for (int j = 0; j < qtd.length; j++) {
			if (albumP[j][1] > 1 && albumA[j][1] == 0) {
				albumP[j][1] -= 1;
				albumA[j][1] += 1;
				contD += 1;
				if (contR == contD || contD == trocasMax) {
					System.out.println("Dei : " + this.selecao[j]);
					break;
				}
				System.out.println("Dei : " + this.selecao[j]);
			}
			check(contR, contD);
		}
		System.out.println();
		System.out.println("Recebi " + contR);
		System.out.println("Dei " + contD);
		System.out.println("------------------------------");
	}
}
