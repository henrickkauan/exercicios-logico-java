import java.util.Scanner;
public class ProgramaMensagem {
	public static void main (String args[]) {
	String n;
	int i;
	Scanner in = new Scanner (System.in);
	System.out.print("Digite seu nome: ");
	n = in.next();
	System.out.print("Digite sua idade: ");
	i = in.nextInt();
	System.out.print(n + ", você tem " + i + " anos.");
	in.close();
	}
}
