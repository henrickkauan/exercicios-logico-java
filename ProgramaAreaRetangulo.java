import java.util.Scanner;
public class ProgramaAreaRetangulo {
	public static void main (String args[]) {
		double b, h, area;
		Scanner in = new Scanner (System.in);
		System.out.print("Digite o valor da base: ");
		b = in.nextDouble();
		System.out.print("Digite o valor da altura:");
		h = in.nextDouble();
		area = b*h;
		System.out.print("O valor da área é: " + area);	
		in.close();
	}
}
