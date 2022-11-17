import java.io.File;
import java.util.*;

//@author Cayan Prola

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] s = new String[]{"QAT","ECU","SEN","NED","ENG","IRN","USA","WAL",
				"ARG","KSA","MEX","POL","FRA","AUS","DEN","TUN","ESP","CRC","GER",
				"JPN","BEL","CAN","MAR","CRO","BRA","SRB","SUI","CMR","POR",
				"GHA","URU", "KOR"};
		
		Figurinhas fp = new Figurinhas();
		Caderneta cp = new Caderneta();
		Pessoa p = new Pessoa();
		cp.setSelecao(s);
				
		
		
		try {
			Scanner sf = new Scanner(new File("teste.txt"));
			
			//Le o ficheiro e da print na seleçao/index e tambem na qtd de cada figurinha
			int n = sf.nextInt();
			for (int i = 0; i < n; i++) { 
				System.out.print(sf.next() + ";");
				System.out.println(sf.nextInt());
			}
			
			//Da print aos valores dos amigos
			//qtd de amigos, depois suas figurinhas
			
			int a = sf.nextInt();
			for (int i = 0; i < a; i++) {
				n = sf.nextInt();
				System.out.println("amigo: " + i);
				for (int j = 0; j < n; j++) {
					
					System.out.print(sf.next() + ";");
					System.out.println(sf.nextInt());
				}
			}
			
			//Inputs txt pros objetos
			for(int i = 0; i < n; i++) {
				cp.setIndex(i);
				fp.printC(cp.getIndex());
			}
			
			sf.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
	
	
	
	
	
	}
}
