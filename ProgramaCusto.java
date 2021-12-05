import java.util.Scanner;
public class ProgramaCusto {
	public static void main(String args[]) {
		int coelho; 
		double custo;
		Scanner in = new Scanner (System.in);
		System.out.print("Digite a quantidade de Coelhos: ");
		coelho = in.nextInt();
		custo = (coelho*0.70)/18+10;
		System.out.print("O custo da criação de coelhos é: " + custo);	
		in.close();
	}
}
