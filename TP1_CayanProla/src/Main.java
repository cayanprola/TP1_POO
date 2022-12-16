import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//@author Cayan Prola & Ricardo Costa

public class Main {
	// Uso dos padroes P para nos e A para os amigos
	static Scanner scan = new Scanner(System.in);
	static String strP[], strA[];
	static int qtdP[], qtdA[];
	static int colecaoP[][], colecaoA[][]; // Colecao guarda na coluna 1 o index da carta e na coluna 2 a quantidade
	static int trocasSort[], darSort[];
	static Figurinhas fp = new Figurinhas(qtdP, strP, colecaoP); // Figurinhas para nos
	static Figurinhas fa[]; // Figurinhas pros amigos
	static Amigos amg[];
	static int trocas, index, trocasMax, dar;

	public static void main(String[] args) throws FileNotFoundException {
//		 TODO Auto-generated method stub
//		String[] s = new String[] { "QAT", "ECU", "SEN", "NED", "ENG", "IRN", "USA", "WAL", "ARG", "KSA", "MEX", "POL",
//				"FRA", "AUS", "DEN", "TUN", "ESP", "CRC", "GER", "JPN", "BEL", "CAN", "MAR", "CRO", "BRA", "SRB", "S1UI",
//				"CMR", "POR", "GHA", "URU", "KOR" };

		menu();

	}

	// Methods
	public static void principal(String input) {
		try {
			Scanner sc = new Scanner(new File(input));
			int n = sc.nextInt();
			strP = new String[n];// Adiciona a quantidade total de figurinhas como o tamanho dos arrays
			qtdP = new int[n];
			colecaoP = new int[n][2];
			int cont = 0;
			for (int i = 0; i < n; i++) {
				cont += 1;
				strP[i] = sc.next(); // Salva os valores do txt em arrays
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
			// Setar os valores das figurinhas e os seus atributos para nós
			fp.setColecao(colecaoP);
			fp.setSelecao(strP);
			fp.setQtd(qtdP);

			int a = sc.nextInt(); // Bloco de codigo que repete o de cima mas para os amigos
			amg = new Amigos[a];
			fa = new Figurinhas[a];
			trocasSort = new int[a];
			darSort = new int[a];
			for (int i = 0; i < a; i++) { // Adiciona a quantidade total de figurinhas dos amigos nos arrays
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
				amg[i].setTrocas(contadorTrocas());
				trocasSort[i] = contadorTrocas();
				darSort[i] = contadorDar();
			}

			trocasAmg(amg);// Chama o metodo da troca
			fp.falta(fp);// Verifica quantas figurinhas faltam

			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Conta as trocas possiveis com cada amigo
	 */
	public static int contadorTrocas() {
		trocas = 0;
		for (int i = 0; i < qtdP.length; i++) {
			if (colecaoP[i][1] == 0 && colecaoA[i][1] > 1) {
				trocas += 1;
			}
		}
		return trocas;
	}

	/*
	 * Conta quantas cartas cada amigo precisa
	 */
	public static int contadorDar() {
		dar = 0;
		for (int i = 0; i < qtdP.length; i++) {
			if (colecaoP[i][1] > 1 && colecaoA[i][1] == 0) {
				dar += 1;
			}
		}
		return dar;
	}

	/*
	 * Metodo do menu, pergunta ao usuario qual input txt ele deseja, caso 0 sai do
	 * programa, caso 1,2 ou 3 executa o metodo principal onde corre todo o programa
	 */
	public static void menu() {
		String input;
		System.out.println("Para qual input deseja ?");
		System.out.println("1-Input1; 2-Input2; 3-Input3; 0-Sair;");
		int op = scan.nextInt();
		switch (op) {
		case 1:
			input = "input1.txt";
			principal(input);
			break;
		case 2:
			input = "input2.txt";
			principal(input);
			break;
		case 3:
			input = "input3.txt";
			principal(input);
			break;
		case 0:
			System.out.println("Obrigado.");
			System.exit(1);
		default:
			System.out.println("Input invalido, tente novamente.");
			menu();
			break;
		}
	}

	/*
	 * Metodo que define qual o maior valor de trocas possiveis, e chama o metodo
	 * das trocas para cada amigo, diminuindo o valor da maior troca possivel para
	 * pegar os amigos que tem um valor de troca menor
	 * 
	 */
	public static void trocasAmg(Amigos amg[]) {
		int trocasMax = Arrays.stream(trocasSort).max().getAsInt();
		while (trocasMax > 0) {
			for (int j = 0; j < amg.length; j++) {
				for (int i = 0; i < amg.length; i++) {
					if (amg[i].getTrocas() == trocasMax) {
						System.out.println("Amigo: " + amg[i].getIndex());
						System.out.println();
						amg[i].getFa().troca(fp, fa[i], j, trocasMax);
					}
				}
				trocasMax -= 1;
			}
		}
	}
}