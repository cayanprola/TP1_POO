
public class Caderneta	{
	private String selecao[];
	
	Caderneta() {}
	
	Caderneta(String selecao[]) {
		this.selecao = selecao;
	}
	
	void printC() {
		for(int i = 0; i < selecao.length; i++) {
			System.out.println(selecao[i]);
		}
	}
}
