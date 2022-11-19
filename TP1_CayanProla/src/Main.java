import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//@author Cayan Prola

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String[] s = new String[] { "QAT", "ECU", "SEN", "NED", "ENG", "IRN", "USA", "WAL", "ARG", "KSA", "MEX", "POL",
				"FRA", "AUS", "DEN", "TUN", "ESP", "CRC", "GER", "JPN", "BEL", "CAN", "MAR", "CRO", "BRA", "SRB", "SUI",
				"CMR", "POR", "GHA", "URU", "KOR" };

		String selecao = "";
		int qtd = 0, qtda = 0;
		Figurinhas fp = new Figurinhas(qtd, selecao);
		Figurinhas fa = new Figurinhas(qtda, selecao);
		
		//Fazer tudo do figurinhas em uma classe so
		
		
		try {
			Scanner sc = new Scanner(new File("input1.txt"));

			int n = sc.nextInt();
			for (int i = 0; i < 40; i++) {
				selecao = sc.next();			//Salva a selecao e a posicao em uma string
				qtd = sc.nextInt();				//Salta a qtd de figurinhas de cada posicao em um int
				fp.setSelecao(selecao);			//Seta os valores para o objeto do player
				fp.setQtd(qtd);
				System.out.println(fp.printC());		//Usa o metodo da classe para printar os valores
			}

			int a = sc.nextInt();					//Bloco de codigo que repete o de cima com a adiçao do numero de amigos
			for (int i = 0; i < a; i++) {
				n = sc.nextInt();
				System.out.println("amigo: " + i);
				for (int j = 0; j < 40; j++) {
					selecao = sc.next();
					qtda = sc.nextInt();
					fa.setSelecao(selecao);
					fa.setQtd(qtda);
					System.out.println(fa.printC());		
				}
			}
			sc.close();
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
