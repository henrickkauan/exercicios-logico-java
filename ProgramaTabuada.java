import java.util.Scanner;
public class ProgramaTabuada {
	public static void main(String args[]){
		
		int numero, resultado;
		
		Scanner in = new Scanner (System.in);
		
		System.out.print ("Digite um valor numerico: ");
		numero = in.nextInt();
		
		System.out.println ("A tabuada do numero " + numero + " é: ");
		
		resultado = numero*1;
		System.out.println(numero + "x1=" + resultado);    
		
		resultado = numero*2;
		System.out.println(numero + "x2=" + resultado);
		
		resultado = numero*3;
		System.out.println(numero + "x3=" + resultado);
		
		resultado = numero*4;
		System.out.println(numero + "x4=" + resultado);
		
		resultado = numero*5;
		System.out.println(numero + "x5=" + resultado);
		
		resultado = numero*6;
		System.out.println(numero + "x6=" + resultado);

		resultado = numero*7;
		System.out.println(numero + "x7=" + resultado);
		
		resultado = numero*8;
		System.out.println(numero + "x8=" + resultado);
		
		resultado = numero*9;
		System.out.println(numero + "x9=" + resultado);
		
		resultado = numero*10;
		System.out.println(numero + "x10=" + resultado);
		
		in.close();
		

	}

}
