import java.util.ArrayList;
import java.util.Scanner;

public class cadastrarPets {
	Scanner scanner = new Scanner(System.in);
	//private ArrayList<String> nomeSobrenome = new ArrayList<>();
	private Pet pet = new Pet();
	
	
	public void cadastrar() {
		while(true) {
			System.out.println("1 - Digite o nome e sobrenome do seu pet:");
			String nome = scanner.nextLine();
			if(verificarNome(nome)) {
				pet.add(nome);
				break;
			}				
		}	
	}
	
	public boolean verificarNome(String nome) {
		try {
			if(!(nome.matches("[a-zA-Z\\s]+"))) {
				System.out.println("Erro: o pet deve ter nome e sobrenome. Tente Novamente");
				return false;
			}
			String[] splitNomeSobrenome = nome.split(" ");
			String splitNome = splitNomeSobrenome[0];
			String splitSobrenome = splitNomeSobrenome[1];
			 
		} catch (Exception e) {
			System.out.println("Erro: o pet deve ter nome e sobrenome. Tente Novamente");
			return false;
		}
		return true;
	}
	
	/*public void listar() {
		for(int i = 0;i <= nomeSobrenome.size() - 1;i ++) {
			System.out.println(nomeSobrenome.get(i));
		}
	}*/
}
