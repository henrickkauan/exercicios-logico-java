import java.util.Scanner;
public class ProgramaCombustivel {
	public static void main(String args[]) {
		double dp, cb, gm;
		Scanner in = new Scanner (System.in); 
		
		System.out.print("Digite a dist�ncia percorrida(em Kil�metros): ");
		dp = in.nextDouble();
		
		System.out.print("Digite a capacidade do tanque de combust�vel(em Litros): ");
		cb = in.nextDouble();
		
		gm = dp/cb;
		
		if (gm>=10) {
			System.out.print("Seu carro � econ�mico");
		}else {
			System.out.print("Seu carro n�o � econ�mico");
		}
			
		in.close();
	}

}
