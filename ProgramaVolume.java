import java.util.Scanner;
public class ProgramaVolume {
	public static void main(String args[]) {
		double r, h, v;
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite o raio de cilindro: ");
		r = in.nextDouble();
		
		System.out.print("Digite a altura do cilindro: ");
		h = in.nextDouble();
		
		v = 3.14*r*r*h;
		
		System.out.println("O volume do cilindro é de: " + v);
		
		
		in.close();
		
		
	}
}
