import java.io.File;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s[] = new String[]{"QAT","ECU","SEN","NED","ENG","IRN","USA","WAL",
				"ARG","KSA","MEX","POL","FRA","AUS","DEN","TUN","ESP","CRC","GER",
				"JPN","BEL","CAN","MAR","CRO","BRA","SRB","SUI","CMR","POR",
				"GHA","URU", "KOR"};
		
		int numCromosP = sc.nextInt();
		
		Figurinhas fp = new Figurinhas();
		fp.setQtd(numCromosP);
		System.out.println(fp.getQtd());
		
		Caderneta c = new Caderneta();
		
		
		
		
		
		
		/*
		 * try{ Scanner sc = new Scanner(new File("input1.txt") );
		 * 
		 * int n = sc.nextInt(); for(int i=0; i<n; i++){ System.out.print(sc.next() +
		 * ";"); System.out.println(sc.nextInt()); } int a = sc.nextInt(); for(int i=0;
		 * i<a; i++){ n = sc.nextInt(); System.out.println("amigo :" + n); for(int j=0;
		 * j<n; j++){ System.out.print(sc.next() + ";");
		 * System.out.println(sc.nextInt()); } } sc.close(); } catch(Exception e){
		 * System.out.println("Error"); }
		 */
	}

}
