import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//@author Cayan Prola & Ricardo Costa

public class Main {

	static String strA[], strP[];
	static int qtd[], qtdA[];
	static int albumP[][], albumA[][];
	static int trocasSort[], indexSort[];
	static Figurinhas fp = new Figurinhas(qtd, strP, albumP);
	static Figurinhas fa = new Figurinhas(qtdA, strA, albumA);
	static Caderneta cp = new Caderneta(fp);
	static Amigos amg[];
	static int trocas, index = 0;

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
			albumP = new int[n][2];

			int cont = 0;
			for (int i = 0; i < n; i++) {
				cont += 1;
				strP[i] = sc.next(); // Salva as os valores do txt em arrays
				qtd[i] = sc.nextInt();
				albumP[i][0] = cont;
				albumP[i][1] = qtd[i];
				/*
				 * Uso de um contador para os indexes da selecao e reseta pra ser sempre ate 20
				 * Usado para efetuar as trocas depois
				 */

				if (cont == 20)
					cont = 0;
			}
			cont = 0;
			// Setar os valores das figurinhas e seus atributos para nós
			fp.setColecao(albumP);
			fp.setSelecao(strP);
			fp.setQtd(qtd);
			cp.setF(fp);
//			cp.printP();

			int a = sc.nextInt(); // Bloco de codigo que repete o de cima mas para os amigos
			amg = new Amigos[a]; //
			trocasSort = new int[a];
			indexSort = new int[a];
			for (int i = 0; i < a; i++) { // Adicionar a quantidade total de figurinhas dos amigos nos arrays
				n = sc.nextInt(); // Define o tamanho dos arrays para a quantidade exata de figurinhas
				strA = new String[n];
				qtdA = new int[n];
				albumA = new int[n][2];
				amg[i] = new Amigos(fa, index, trocas); // Define a quantidade de amigos
				index += 1;
				for (int j = 0; j < n; j++) {
					cont += 1;
					strA[j] = sc.next();
					qtdA[j] = sc.nextInt();
					albumA[j][0] = cont;
					albumA[j][1] = qtdA[j];
					if (cont == 20)
						cont = 0;
				}

				/*
				 * Seta os valores e atributos para todos os amigos, com a adiçao do seu index e
				 * quantas trocas conseguimos fazer com cada um
				 */
				fa.setColecao(albumA);
				fa.setSelecao(strA);
				fa.setQtd(qtdA);
				amg[i].setFa(fa);
				amg[i].setIndex(index);
				amg[i].setTrocas(verifica());
				indexSort[i] = index;
				trocasSort[i] = verifica();

			}
			indexT(a, amg);
			for (int i = 0; i < a; i++) {
				Arrays.sort(indexSort);
				System.out.println(amg[i].getIndex());
				System.out.println(amg[i].getTrocas());
				System.out.println("_________________________");
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

			}
		}
		return trocas;
	}

	public static void indexT(int a, Amigos s[]) { // Metodo que chama a funçao greedy para os amigos e seta seus novos
													// valores
		for (int i = 0; i < amg.length; i++) {

			s[i].greedy(a, trocasSort, indexSort); // Sort no valor das trocas usando a estrategia greedy
			Arrays.sort(indexSort); // Da sort no index dos amigos baseado em quantas trocas conseguimos fazer com
			// eles e seta o seu novo index
			s[i].setIndex(indexSort[i]);
			s[i].setTrocas(trocasSort[i]);

			s[i].printIT(i);
		}
	}
	// Fazer as trocas primeiro com amg[0] ate amigo [4]
//	public static void trade() {
//		int contR = 0;// Contador para manter as trocas 1:1
//		int contD = 0;
//		for (int i = 0; i < qtd.length; i++) {
//			if (albumP[i][1] == 0 && albumA[i][1] >= 1) {
//				albumP[i][1] += 1;
//				albumA[i][1] -= 1;
//				contR += 1;
//
//				System.out.println("Recebi: " + strP[i]);
//			}
//		}
//	}
//
//	public static void troca() {
//		int contR = 0;// Contador para manter as trocas 1:1
//		int contD = 0;
//		for (int i = 0; i < amg.length; i++) {
//			if (amg[0].getIndex() == 1) {
//				albumA = amg[0].getFa().getColecao();
//				trade();
//			} else if (amg[1].getIndex() == 1) {
//				trade();
//			} else if (amg[2].getIndex() == 1) {
//				trade();
//			} else if (amg[3].getIndex() == 1) {
//				trade();
//			} else if (amg[4].getIndex() == 1) {
//				trade();
//			}

//			 else if (albumP[k][1] > 1 && albumA[k][1] == 0) {
//					albumA[k][1] += 1;
//					albumP[k][1] -= 1;
//					contD += 1;
//					if (contR != contD) {
//
//					}
//					System.out.println("Dei: " + strP[k]);
//				}

}

//Algoritmo pras trocas
//strT[i] = strP[i];
//albumP[i][1] += 1;
//albumA[i][1] -= 1;
//System.out.println("Recebi: " + strT[i]);

//else if (albumP[i][1] > 1 && albumA[i][1] == 0) {
//albumA[i][1] += 1;
//albumP[i][1] -= 1;
