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
		String s1 = "";
		String s2[] = new String[200];
		String s3[] = new String[40];
		Figurinhas[] fp = new Figurinhas[6];

		int qtd[] = new int[200];
		fp[0] = new Figurinhas(qtd, s3);
		fp[1] = new Figurinhas(qtd, s2);
		fp[2] = new Figurinhas(qtd, s2);
		fp[3] = new Figurinhas(qtd, s2);
		fp[4] = new Figurinhas(qtd, s2);
		fp[5] = new Figurinhas(qtd, s2);
//		

		try {
			Scanner sc = new Scanner(new File("input1.txt"));
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				s3[i] = sc.next(); // Salva a selecao e a posicao em uma string
				qtd[i] = sc.nextInt(); // Salva a qtd de figurinhas de cada posicao em um int
			}

			fp[0].setSelecao(s3);
			fp[0].setQtd(qtd);
			fp[0].printC();

			int a = sc.nextInt(); // Bloco de codigo que repete o de cima com a adiçao do numero de amigos
			for (int i = 1; i <= a; i++) {
				n = sc.nextInt();
				System.out.println("------------------------------------------------------------------");
				System.out.println("amigo: " + i);
				for (int j = 0; j < n; j++) {
					s2[j] = sc.next();
					qtd[j] = sc.nextInt();
				}

				fp[i].setSelecao(s2);
				fp[i].setQtd(qtd);
				fp[i].printC();

			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		fp[0].printC();
//		for(int i = 0; i < 5; i++) {      //print de todos os valores pra teste
//			fp[i].printC();
//		}

	}

}
