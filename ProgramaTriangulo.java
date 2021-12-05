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
			System.out.print("Isto não é um Triangulo");
			
		}else if (a == b && b == c) {
			System.out.print("Este é um Triângulo Equilátero = Três lados iguais.");
		}else if (a != b && b !=c && a !=c) {
			System.out.print("Este é um Triângulo Escaleno = Três lados diferentes.");
		}else {
			System.out.print("Este é um Triângulo Isósceles = Dois lados iguais e um lado diferente.");
		}
			
			
		in.close();
	}
}
