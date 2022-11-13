
public class Pessoa extends Figurinhas{
	private int amigos;
	
	Pessoa() {
		super();
	}
	
	Pessoa(int amigos) {
		super();
	}
	Pessoa(int amigos, int qtd) {
		super(qtd);
		this.amigos = amigos;
	}
	Pessoa(int amigos, int qtd, String selecao[], int index) {
		super(qtd, selecao, index);
		this.amigos = amigos;
	}
	
	//Setters & Getters
		public int getAmigos() {
			return this.amigos;
		}
		public void setAmigos(int amigos) {
			this.amigos = amigos;
		}
}
