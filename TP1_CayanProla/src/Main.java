import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//@author Cayan Prola

public class Main {

	static String strA[], strP[], strT[];
	static int qtd[], qtdA[], necessito[][], troco[][], tmp[][];
	static int albumP[][], albumA[][];
	static int indexA = 0;
	static Figurinhas fp = new Figurinhas(qtd, strP, albumP);
	static Figurinhas fa = new Figurinhas(qtdA, strA, albumA);
	static Caderneta cp = new Caderneta(fp);
	static Amigos amg[], amgtemp;
	static int trocas = 0;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		String[] s = new String[] { "QAT", "ECU", "SEN", "NED", "ENG", "IRN", "USA", "WAL", "ARG", "KSA", "MEX", "POL",
//				"FRA", "AUS", "DEN", "TUN", "ESP", "CRC", "GER", "JPN", "BEL", "CAN", "MAR", "CRO", "BRA", "SRB", "SUI",
//				"CMR", "POR", "GHA", "URU", "KOR" };

		try {
			Scanner sc = new Scanner(new File("input1.txt"));
			int n = sc.nextInt();
			strP = new String[n];// Adicionar a quantidade total de figurinhas como o tamanho dos arrays
			strT = new String[n];
			qtd = new int[n];
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
			fp.setSelecao(strP);
			fp.setQtd(qtd);
			cp.setF(fp);
			cp.printP();

			int a = sc.nextInt(); // Bloco de codigo que repete o de cima para os amigos
			amg = new Amigos[a]; //
			tmp = new int[a][2];
			for (int i = 0; i < a; i++) { // Adicionar a quantidade total de figurinhas dos amigos nos arrays

				n = sc.nextInt();
				strA = new String[n];
				qtdA = new int[n];
				albumA = new int[n][2];
				amg[i] = new Amigos(fa, indexA, verifica());
				indexA += 1;
				System.out.println("------------------------------------------------------------------");
//				System.out.println("amigo: " + (i + 1));
				for (int j = 0; j < n; j++) {
					cont += 1;
					strA[j] = sc.next();
					qtdA[j] = sc.nextInt();
					albumA[j][0] = cont;
					albumA[j][1] = qtdA[j];
					if (cont == 20)
						cont = 0;
				}
				tmp[i][0] = indexA;
				tmp[i][1] = verifica();

//				System.out.println("Index: " + tmp[i][0] + " Trocas: " + tmp[i][1]);

				fa.setAlbum(albumA);
				fa.setSelecao(strA);
				fa.setQtd(qtdA);

				amg[i].setFa(fa);
				amg[i].setIndex(indexA);
				amg[i].setTrocas(verifica());
				amg[i].printIt();
				amg[i].printAmg();

			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Methods

	public static int verifica() {
		trocas = 0;
		for (int i = 0; i < qtd.length; i++) {
			if (albumP[i][1] == 0 && albumA[i][1] > 1) {
				trocas += 1;
//				strT[i] = strP[i];
//				albumP[i][1] += 1;
//				albumA[i][1] -= 1;
//				System.out.println("Recebi: " + strT[i]);
			}
		}

//		System.out.println("Index do amigo: " + indexA + " Trocas possiveis: " + trocas);
		return trocas;
	}

	public static void greedy() {
		if (amg[0].getTrocas() > amg[1].getTrocas()) {

		}

	}

//	public static void greedy() {
////		int contR = 0;
////		int contD = 0;
//		for (int j = 0; j < ; j++) {
//			for (int i = 0; i < qtd.length; i++) {
//				if (albumP[i][1] == 0 && albumA[i][1] > 1) {
//					albumP[i][1] += 1;
//					albumA[i][1] -= 1;
////					contR += 1;
////					contD += 1;
//					
//					System.out.println("Recebi: " + strP[i]);
//				} 
////				else if (albumP[i][1] > 1 && albumA[i][1] == 0) {
////					albumA[i][1] += 1;
////					albumP[i][1] -= 1;
////
////					
////					System.out.println("Dei: " + strP[i]);
////				}
//			}
//		}
//	}
}

//Algoritmo pras trocas
//strT[i] = strP[i];
//albumP[i][1] += 1;
//albumA[i][1] -= 1;
//System.out.println("Recebi: " + strT[i]);

//else if (albumP[i][1] > 1 && albumA[i][1] == 0) {
//albumA[i][1] += 1;
//albumP[i][1] -= 1;
