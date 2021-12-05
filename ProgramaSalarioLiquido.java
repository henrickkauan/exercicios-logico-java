import java.util.Scanner;
public class ProgramaSalarioLiquido {
	public static void main(String args[]) {
		double ha, am, inss, sb, sd, sl;
		Scanner in = new Scanner (System.in);
		System.out.print("Digite o valor da hora aula dada: ");
		ha = in.nextDouble();
		System.out.print("Digite o número de aulas dadas no mês: ");
		am = in.nextDouble();
		System.out.print("Digite o percentual do INSS: ");
		inss = in.nextDouble();
		sb = ha*am;
		sd = (sb*inss)/100;
		sl = sb-sd;
		System.out.print("Seu sálario líquido é de: " + sl);	
		in.close();
	}
}
