import java.util.Scanner;
public class ProgramaIdade {
	public static void main(String args[]) {
		int at, an, idade;
		
		Scanner in = new Scanner (System.in);
		
		System.out.print ("Digite o ano atual: ");
		at = in.nextInt();
		
		System.out.print ("Digite o seu ano de nascimento: ");
		an = in.nextInt();
		
		idade = at-an;
		System.out.print ("Sua idade atual é de: " + idade + " anos");

		in.close();
	}

}
