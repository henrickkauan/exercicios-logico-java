public class vetores1 {
	public static void main(String[] args) {
		//tipo[] nome   =  conteudo
		String[] carros = {"ferrari","fusca","camaro","uno"};
		//índice do vetor =   [0]       [1]      [2]    [3]
		System.out.println("Tamanho do array: " + carros.length);
		//saber tamanho do vetor = nome.length;
		System.out.println("Carro: " + carros[2]);
		//mostra conteudo de um vetor especifico = nome[valor do indice];
		
		carros[2] = "porsche";
		//modificando valor do vetor do indice 2
		System.out.println("Carro: " + carros[2]);
		
		System.out.println("----------------------");
		
		System.out.println("Carros: ");
		for (int i = 0; i < carros.length; i++) {
			System.out.println(carros[i]);
		}



		
	}

}
