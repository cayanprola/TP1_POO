
public class Caderneta	{
	private String selecao[];
	private int index;
	
	Caderneta() {}
	
	Caderneta(String selecao[], int index) {
		this.selecao = selecao;
		this.index = index;
	}
	
	//Setters & Getters
	public String[] getSelecao() {
		return this.selecao;
	}
	public void setSelecao(String selecao[]) {
		this.selecao = selecao;
	}
	public int getIndex( ) {
		return this.index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	
	
	
	void printC() {
		for(int i = 0; i < selecao.length; i++) {
			System.out.println(selecao[i]);
		}
	}
}
