import java.util.Scanner;
public class ProgramaPrestação {
	public static void main (String args[]) {
		double valor, taxa, tempo, prestacao;
		Scanner in = new Scanner (System.in);
		System.out.print("Digite o valor original da prestação: ");
		valor = in.nextDouble();
		System.out.print("Digite o valor da taxa: ");
		taxa = in.nextDouble();
		System.out.print("Digite o tempo que a prestação está atrasada: ");
		tempo = in.nextDouble();
		prestacao = valor+(valor*(taxa/100)*tempo);
		System.out.print("O valor da sua prestação com as taxas é de: " + prestacao);	
		in.close();
	}
}
