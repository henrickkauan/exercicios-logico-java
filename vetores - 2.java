import java.util.ArrayList;

public class vetores2 {

	public static void main(String[] args) {
		//sintaxe
		ArrayList<String> contatos = new ArrayList<>();
		contatos.add("Jos� de Assis");
		contatos.add("9999-9999");
		contatos.add("z�@email.com");
		contatos.add("Robson Vaamonde");
		contatos.add("5555-5555");
		contatos.add("vava@email.com");
		
		System.out.println("Tamanho do Array: " + contatos.size());
		System.out.println(contatos);
		System.out.println("Email- Jos� de Assis: " + contatos.get(2));
		
		System.out.println("----------------------------------");
		
		for(int i=0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i));
		}
		
	

	}

}
