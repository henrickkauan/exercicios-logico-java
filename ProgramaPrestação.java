import java.util.Scanner;
public class ProgramaPresta��o {
	public static void main (String args[]) {
		double valor, taxa, tempo, prestacao;
		Scanner in = new Scanner (System.in);
		System.out.print("Digite o valor original da presta��o: ");
		valor = in.nextDouble();
		System.out.print("Digite o valor da taxa: ");
		taxa = in.nextDouble();
		System.out.print("Digite o tempo que a presta��o est� atrasada: ");
		tempo = in.nextDouble();
		prestacao = valor+(valor*(taxa/100)*tempo);
		System.out.print("O valor da sua presta��o com as taxas � de: " + prestacao);	
		in.close();
	}
}
