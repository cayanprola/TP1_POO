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
		int index = 0, qtd = 0;
		
		Figurinhas fp = new Figurinhas(qtd, selecao, index);
		Caderneta cp = new Caderneta(selecao, index);

		try {
			Scanner sc = new Scanner(new File("input1.txt"));

			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				cp.setSelecao(sc.next());
				cp.setIndex(sc.nextInt());
				System.out.print(cp.getSelecao() + "; ");
				System.out.println(cp.getIndex());
			}
			int a = sc.nextInt();
			for (int i = 0; i < a; i++) {
				n = sc.nextInt();
				System.out.println("amigo: " + i);
				for (int j = 0; j < n; j++) {
					cp.setSelecao(sc.next());
					cp.setIndex(sc.nextInt());
					System.out.print(cp.getSelecao() + "; ");
					System.out.println(cp.getIndex());
				}
			}
			sc.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
		
	}
}
