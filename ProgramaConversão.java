import java.util.Scanner;
public class ProgramaConvers�o {
	public static void main(String args[]) {
		double f, c;
		Scanner in = new Scanner (System.in);
		System.out.print("Digite o valor em Fahrenheit: ");
		f = in.nextDouble();
		c = (f-32)/1.8;
		System.out.print("A convers�o para Celsius �: " + c);
		in.close();
	}
}
