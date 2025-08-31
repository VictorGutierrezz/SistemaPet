import java.util.ArrayList;

public class Pet {
	private static ArrayList<String> cadastro = new ArrayList<>();
	
	public void add(String nome) {
		this.cadastro.add(nome);
	}
	
	public void listar() {
		for(int i = 0;i < cadastro.size();i++) {
			System.out.println(cadastro.get(i));
		}
	}
}
