import java.util.Scanner;
public class ProgramaTriangulo {
	public static void main (String args[]) {
		int a, b, c;
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite o primeiro valor: ");
		a = in.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		b = in.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		c = in.nextInt();
		
		if (a>(b+c)||b>(a+c)||c>(a+b)) {
			System.out.print("Isto n�o � um Triangulo");
			
		}else if (a == b && b == c) {
			System.out.print("Este � um Tri�ngulo Equil�tero = Tr�s lados iguais.");
		}else if (a != b && b !=c && a !=c) {
			System.out.print("Este � um Tri�ngulo Escaleno = Tr�s lados diferentes.");
		}else {
			System.out.print("Este � um Tri�ngulo Is�sceles = Dois lados iguais e um lado diferente.");
		}
			
			
		in.close();
	}
}
