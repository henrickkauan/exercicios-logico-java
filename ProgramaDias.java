import java.util.Scanner;
public class ProgramaDias {
	public static void main(String args[]) {
		double m, a, d;
		Scanner in = new Scanner (System.in);
		
		System.out.print("Quantos dias? ");
		d = in.nextInt();
		
		m = d/30;
		a = d/365;
		
		System.out.println(d + " dias convertido em meses é: " + m);
		System.out.print(d + " dias convertido em anos é: " + a);
		
		in.close();
		
		
		
	}

}
