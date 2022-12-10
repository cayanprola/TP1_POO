
public class Caderneta {
	private Figurinhas f = new Figurinhas();

	// Constructors
	Caderneta(Figurinhas newF) {
		this.f = newF;
	}

	// Setters & Getters

	// Getters
	public Figurinhas getF() {
		return this.f;
	}

	// Setters
	public void setF(Figurinhas newF) {
		this.f = newF;
	}

	public void printP() {
		f.printA();
	}
}
