public class Figurinhas {
	private int qtd[] = new int[640];
	private String selecao[] = new String[640];
	private int album[][] = new int[640][2];

	// Constructors
	Figurinhas(int newQtd[], String[] newSelecao, int newAlbum[][]) {
		this.album = newAlbum;
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

	public int[][] getAlbum() {
		return this.album;
	}

	// Setters
	public void setQtd(int newQtd[]) {
		this.qtd = newQtd;
	}

	public void setAlbum(int newAlbum[][]) {
		this.album = newAlbum;
	}

	public void setSelecao(String[] newSelecao) {
		this.selecao = newSelecao;
	}

	//Methods
	public void printA() { // Metodo para printar o index e a quantidade de cada selecao, usado para
							// efetuar as trocas
		for (int i = 0; i < album.length; i++) {
			System.out.println(this.album[i][0] + "; " + this.album[i][1]);
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
}
