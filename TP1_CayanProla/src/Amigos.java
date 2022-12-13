
public class Amigos {
	private Figurinhas fa = new Figurinhas();
	private int index[];
	private int trocas[];

	// Constructors
	Amigos(Figurinhas newFa) {
		this.fa = newFa;
	}

	Amigos(Figurinhas newFa, int newIndex[]) {
		this.fa = newFa;
		this.index = newIndex;
	}

	Amigos(Figurinhas newFa, int newIndex[], int[] newTrocas) {
		this.fa = newFa;
		this.index = newIndex;
		this.trocas = newTrocas;
	}

	// Setters & Getters

	// Getters
	public Figurinhas getFa() {
		return this.fa;
	}

	public int[] getIndex() {
		return this.index;
	}

	public int[] getTrocas() {
		return this.trocas;
	}

	// Setters
	public void setFa(Figurinhas newFa) {
		this.fa = newFa;
	}

	public void setIndex(int newIndex[]) {
		this.index = newIndex;
	}

	public void setTrocas(int[] newTrocas) {
		this.trocas = newTrocas;
	}

	// Methods
	public void printAmg() {
		fa.printA();
	}

	public void greedy() {
		for (int i = 0; i < index.length; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < index.length; j++) {
				if (trocas[j] > trocas[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = index[i];
			index[i] = index[maxIndex];
			index[maxIndex] = temp;

			temp = trocas[i];
			trocas[i] = trocas[maxIndex];
			trocas[maxIndex] = temp;
		}
	}

	public void arrIndex() {

	}

	public void printI(int i) {
		System.out.println("Index: " + this.index[i]);
	}

	public void printT(int i) {
		System.out.println("Trocas: " + this.trocas[i]);
	}

	public void printIT(int i) {
		System.out.println("Index: " + this.index[i] + " Trocas: " + this.trocas[i]);

	}
}
