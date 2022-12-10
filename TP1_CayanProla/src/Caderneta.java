
public class Caderneta {
	private Figurinhas e = new Figurinhas();
	private int album[][] = new int[640][2];

	Caderneta(int newAlbum[][]) {
		this.album = newAlbum;
	}

	// Setters & Getters
	public int[][] getAlbum() {
		return this.album;
	}

	public void setAlbum(int newAlbum[][]) {
		this.album = newAlbum;
	}

	// Methods
	public void printA() { // Metodo para printar o index e a quantidade de cada selecao, usado para
		// efetuar as trocas
		for (int i = 0; i < album.length; i++) {
			System.out.println(this.album[i][0] + "; " + this.album[i][1]);
		}
	}
}
