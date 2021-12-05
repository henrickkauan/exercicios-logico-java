import java.util.Scanner;
public class ProgramaCombustivel {
	public static void main(String args[]) {
		double dp, cb, gm;
		Scanner in = new Scanner (System.in); 
		
		System.out.print("Digite a distância percorrida(em Kilômetros): ");
		dp = in.nextDouble();
		
		System.out.print("Digite a capacidade do tanque de combustível(em Litros): ");
		cb = in.nextDouble();
		
		gm = dp/cb;
		
		if (gm>=10) {
			System.out.print("Seu carro é econômico");
		}else {
			System.out.print("Seu carro não é econômico");
		}
			
		in.close();
	}

}
