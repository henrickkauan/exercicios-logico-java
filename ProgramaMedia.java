import java.util.Scanner;
public class ProgramaMedia {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int n1, n2, n3, n4, m;
		System.out.print("Digite a primeira nota: ");
		n1 = in.nextInt();
		System.out.print("Digite a segunda nota: ");
		n2 = in.nextInt();
		System.out.print("Digite a terceira nota: ");
		n3 = in.nextInt();
		System.out.print("Digite a quarta nota: ");
		n4 = in.nextInt();
		m = (n1+n2+n3+n4)/4;
		System.out.print("Sua media é: " + m);
		in.close();	
	}
}
