import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//@author Cayan Prola & Ricardo Costa

public class Main {
	//Uso dos padroes P para nos e A para os amigos
	static String strP[], strA[]; 
	static int qtdP[], qtdA[];
	static int colecaoP[][], colecaoA[][]; //Colecao P pra nos, A para os amigos
	static int trocasSort[], indexSort[];
	static Figurinhas fp = new Figurinhas(qtdP, strP, colecaoP); //Figurinhas para nos
	static Caderneta cp = new Caderneta(fp); //Cadernetas para nos
	static Figurinhas fa[]; //Figurinhas pros amigos
	static Amigos amg[]; 
	static int trocas, index;

	public static void main(String[] args) throws FileNotFoundException {
//		 TODO Auto-generated method stub
//		String[] s = new String[] { "QAT", "ECU", "SEN", "NED", "ENG", "IRN", "USA", "WAL", "ARG", "KSA", "MEX", "POL",
//				"FRA", "AUS", "DEN", "TUN", "ESP", "CRC", "GER", "JPN", "BEL", "CAN", "MAR", "CRO", "BRA", "SRB", "S1UI",
//				"CMR", "POR", "GHA", "URU", "KOR" };

		try {
			Scanner sc = new Scanner(new File("input1.txt"));
			int n = sc.nextInt();
			strP = new String[n];// Adicionar a quantidade total de figurinhas como o tamanho dos arrays
			qtdP = new int[n];
			colecaoP = new int[n][2];

			int cont = 0;
			for (int i = 0; i < n; i++) {
				cont += 1;
				strP[i] = sc.next(); // Salva as os valores do txt em arrays
				qtdP[i] = sc.nextInt();
				colecaoP[i][0] = cont;
				colecaoP[i][1] = qtdP[i];
				/*
				 * Uso de um contador para os indexes da selecao e reseta pra ser sempre ate 20
				 * Usado para efetuar as trocas depois
				 */

				if (cont == 20)
					cont = 0;
			}
			cont = 0;
			// Setar os valores das figurinhas e seus atributos para nós
			fp.setColecao(colecaoP);
			fp.setSelecao(strP);
			fp.setQtd(qtdP);
			cp.setF(fp);
//			cp.printP();

			int a = sc.nextInt(); // Bloco de codigo que repete o de cima mas para os amigos
			amg = new Amigos[a];
			fa = new Figurinhas[a];
			trocasSort = new int[a];
			indexSort = new int[a];
			for (int i = 0; i < a; i++) { // Adicionar a quantidade total de figurinhas dos amigos nos arrays
				n = sc.nextInt(); // Define o tamanho dos arrays para a quantidade exata de figurinhas
				strA = new String[n];
				qtdA = new int[n];
				colecaoA = new int[n][2];
				fa[i] = new Figurinhas(qtdA, strA, colecaoA);
				amg[i] = new Amigos(fa[i], index, trocas); // Define a quantidade de amigos
				index += 1;
				for (int j = 0; j < n; j++) {
					cont += 1;
					strA[j] = sc.next();
					qtdA[j] = sc.nextInt();
					colecaoA[j][0] = cont;
					colecaoA[j][1] = qtdA[j];
					if (cont == 20)
						cont = 0;
				}

				/*
				 * Seta os valores e atributos para todos os amigos, com a adiçao do seu index e
				 * quantas trocas conseguimos fazer com cada um
				 */
				fa[i].setSelecao(strA);
				fa[i].setQtd(qtdA);
				amg[i].setFa(fa[i]);
				amg[i].setIndex(index);
				amg[i].setTrocas(contTroca());
				indexSort[i] = index;
				trocasSort[i] = contTroca();

			}
			amigosSort(a, amg);//Funçao que da sort no index e nas trocas dos amigos

			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Methods
	public static int contTroca() {
		trocas = 0;
		for (int i = 0; i < qtdP.length; i++) {
			if (colecaoP[i][1] == 0 && colecaoA[i][1] > 1) {
				trocas += 1;

			}
		}
		return trocas;
	}

	public static void amigosSort(int a, Amigos s[]) { // Metodo que chama a funcao greedy para os amigos e seta seus
														// novos
														// valores
		for (int i = 0; i < amg.length; i++) {
			s[i].greedy(a, trocasSort, indexSort); // Sort no valor das trocas usando a estrategia greedy
			Arrays.sort(indexSort);
			// Da sort no index dos amigos baseado em quantas trocas conseguimos fazer com
			// eles e seta o seu novo index
			s[i].setIndex(indexSort[i]);
			s[i].setTrocas(trocasSort[i]);
		}
	}
}

//Algoritmo pras trocas
//strT[i] = strP[i];
//albumP[i][1] += 1;
//albumA[i][1] -= 1;
//System.out.println("Recebi: " + strT[i]);

//else if (albumP[i][1] > 1 && albumA[i][1] == 0) {
//albumA[i][1] += 1;
//albumP[i][1] -= 1;
