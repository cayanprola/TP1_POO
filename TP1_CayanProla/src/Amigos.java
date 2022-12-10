
public class Amigos {
	private Figurinhas fa = new Figurinhas();
	private int index;
	private int trocas;

	// Constructors
	Amigos(Figurinhas newFa) {
		this.fa = newFa;
	}

	Amigos(Figurinhas newFa, int newIndex) {
		this.fa = newFa;
		this.index = newIndex;
	}

	Amigos(Figurinhas newFa, int newIndex, int newTrocas) {
		this.fa = newFa;
		this.index = newIndex;
		this.trocas = newTrocas;
	}

	// Setters & Getters

	// Getters
	public Figurinhas getFa() {
		return this.fa;
	}

	public int getIndex() {
		return this.index;
	}

	public int getTrocas() {
		return this.trocas;
	}

	// Setters
	public void setFa(Figurinhas newFa) {
		this.fa = newFa;
	}

	public void setIndex(int newIndex) {
		this.index = newIndex;
	}

	public void setTrocas(int newTrocas) {
		this.trocas = newTrocas;
	}

	// Methods
	public void printAmg() {
		fa.printA();
	}

	public void printIt() {
		System.out.println("Index: " + this.index + " Trocas: " + this.trocas);
	}
}
