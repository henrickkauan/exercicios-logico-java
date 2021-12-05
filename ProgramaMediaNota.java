import java.util.Scanner;
public class ProgramaMediaNota {
	public static void main(String args[]) {
		
	int n1, n2, n3, media;
		
	Scanner in = new Scanner (System.in);
	
	System.out.print("Digite a primeira nota: ");
	n1 = in.nextInt();
	
	System.out.print("Digite a segunda nota: ");
	n2 = in.nextInt();
	
	System.out.print("Digite a terceira nota: ");
	n3 = in.nextInt();
	
	media = (n1+n2+n3)/3;
	
	System.out.println("A nota media é: " + media);
	
	in.close();
	
	}

}
