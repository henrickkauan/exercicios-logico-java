import java.util.Scanner; 
public class ProgramaConversosReal {
	public static void main(String args[]) {
		double r, e, d, convE, convD;
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite o valor em real: ");
		r = in.nextDouble();
		
		System.out.print("Digite a cotação do euro atual: ");
		e = in.nextDouble();
		
		System.out.print("Digite a cotação do dolar atual: ");
		d = in.nextDouble();
		
		convE = r/e;
		convD = r/d;
		
		System.out.println("O valor em euro é de: " + convE);
		System.out.print("O valor em dolar é de: " + convD);
		
		in.close();	
	}
}
