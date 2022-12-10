import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//@author Cayan Prola

public class Main {

	static String strA[], strP[];
	static int qtd[], qtdA[], necessito[], troco[];
	static int albumP[][], albumA[][];
	static Figurinhas fp = new Figurinhas(qtd, strP, albumP);
	static Figurinhas[] fa;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		String[] s = new String[] { "QAT", "ECU", "SEN", "NED", "ENG", "IRN", "USA", "WAL", "ARG", "KSA", "MEX", "POL",
//				"FRA", "AUS", "DEN", "TUN", "ESP", "CRC", "GER", "JPN", "BEL", "CAN", "MAR", "CRO", "BRA", "SRB", "SUI",
//				"CMR", "POR", "GHA", "URU", "KOR" };

		try {
			Scanner sc = new Scanner(new File("input1.txt"));
			int n = sc.nextInt();
			strP = new String[n];// Adicionar a quantidade total de figurinhas como o tamanho dos arrays
			qtd = new int[n];
			troco = new int[n];
			albumP = new int[n][2];

			int cont = 0;
			for (int i = 0; i < n; i++) {
				cont += 1;
				strP[i] = sc.next(); // Salva as os valores em arrays e adiciona os no objeto para o user
				qtd[i] = sc.nextInt();
				albumP[i][0] = cont;
				albumP[i][1] = qtd[i];
				if (cont == 20)
					cont = 0;
			}
			cont = 0;

			fp.setAlbum(albumP);
			fp.printA();
			fp.setSelecao(strP);
			fp.setQtd(qtd);
//			fp.printC();

			int a = sc.nextInt(); // Bloco de codigo que repete o de cima para os amigos
			fa = new Figurinhas[a]; //

			for (int i = 0; i < a; i++) { // Adicionar a quantidade total de figurinhas dos amigos nos arrays
				n = sc.nextInt();
				strA = new String[n];
				qtdA = new int[n];
				albumA = new int[n][2];
				fa[i] = new Figurinhas(qtdA, strA, albumA);
				System.out.println("------------------------------------------------------------------");
				System.out.println("amigo: " + (i + 1));
				for (int j = 0; j < n; j++) {
					cont += 1;
					strA[j] = sc.next();
					qtdA[j] = sc.nextInt();
					albumA[j][0] = cont;
					albumA[j][1] = qtdA[j];
					if (cont == 20)
						cont = 0;
				}
				fa[i].setAlbum(albumA);
				fa[i].printA();
				fa[i].setSelecao(strA);
				fa[i].setQtd(qtdA);
//				fa[i].printC();
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

	//Methods
	
	public static void verifica() {
		int cont = 0;
		for (int i = 0; i < qtd.length; i++) {
			if (qtd[i] == 0) {
				cont += 1;
				necessito = new int[cont];
			}

			else if (qtd[i] > 1) {
				troco[i] = qtd[i];
			}

		}
		for (int i = 0; i < necessito.length; i++) {
			System.out.println(necessito[i]);
		}
	}

}
