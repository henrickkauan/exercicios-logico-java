import java.util.Scanner;
public class ProgramaTrocaValores {
	public static void main(String args[]) {
		String n1, n2, n3;
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite o primeiro valor: ");
		n1 = in.next();
		
		System.out.print("Digite o segundo valor: ");
		n2 = in.next();
		
		n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.println("Resultado do v1: " + n1 );
		System.out.print("Resultado  do  v2: " + n2);
		
		in.close();
		
		
		
	}
	
}
