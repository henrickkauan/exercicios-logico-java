import java.util.Scanner; 
public class ProgramaSalario {
	public static void main(String args[]) {
	double s, p;
	Scanner in = new Scanner (System.in);
	System.out.print("Digite seu sálario: ");
		s = in.nextDouble();
		p = (30*s)/100;
		System.out.print("Ficara comprometido para dividas: " + p);
	in.close();
	}
}
