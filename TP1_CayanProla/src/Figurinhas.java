import java.util.Arrays;

public class Figurinhas extends Caderneta {
	private int qtd;
//	private boolean rptd;

	// Constructors
	Figurinhas(int qtd, String selecao) {
		super(selecao);
		this.qtd = qtd;
	}

	// Setters & Getters
	public int getQtd() {
		return this.qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public String printC() {
	
			return this.getSelecao() + "; " + this.getQtd();
		
	}
//	public boolean getRptd() {
//		return this.rptd;
//	}
//	public void setRptd(boolean rptd) {
//		this.rptd = rptd;
//	}
}
