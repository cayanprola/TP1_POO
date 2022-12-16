
public class Amigos {
	private Figurinhas fa = new Figurinhas();
	private int index; // Index de cada amigo
	private int trocas; // Quantidade de trocas que cada um pode efetuar

	// Constructors
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

	public void printAmg() {// Print de todas as figurinhas dos amigos
		fa.printA();
	}

	@Deprecated
	public void printIT(int i) { // Print no index e quantidade de trocas de cada amigo
		System.out.println("Index: " + this.index + " Trocas: " + this.trocas);
	}
}
