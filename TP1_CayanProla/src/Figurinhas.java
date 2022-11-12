
public class Figurinhas extends Caderneta {
	private int qtd;
	private boolean rptd;
	
	//Constructors
	Figurinhas() {
		super();
	}
	
	Figurinhas(int qtd, boolean rptd) {
		super();
	}
	
	Figurinhas(String selecao[], int index, int qtd, boolean rptd) {
		super(selecao, index);
		this.qtd = qtd;
		this.rptd = rptd;
	}
	
	//Setters & Getters
	public int getQtd() {
		return this.qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public boolean getRptd() {
		return this.rptd;
	}
	public void setRptd(boolean rptd) {
		this.rptd = rptd;
	}
}
