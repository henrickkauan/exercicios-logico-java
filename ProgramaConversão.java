import java.util.Scanner;
public class ProgramaConversão {
	public static void main(String args[]) {
		double f, c;
		Scanner in = new Scanner (System.in);
		System.out.print("Digite o valor em Fahrenheit: ");
		f = in.nextDouble();
		c = (f-32)/1.8;
		System.out.print("A conversão para Celsius é: " + c);
		in.close();
	}
}
