import java.util.Scanner; 
public class AreaTriangulo {
	public static void main(String args[]) {
		double  base, altura, area;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite a base do Triangulo: ");
		base = in.nextDouble();
		
		System.out.print("Digite a altura do Triangulo: ");
		altura = in.nextDouble();
		
		area = (base*altura)/2;
		System.out.print("A area do Triangulo é: " + area);
	
		in.close();
	}
}
