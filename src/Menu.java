import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Formulario formulario = new Formulario();
		formulario.chamaFormulario();;
		
		
		chamarMenu();
		
	}
	
	public static void chamarMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n1.Cadastrar um novo pet");
		System.out.println("2.Alterar os dados do pet cadastrado");
		System.out.println("3.Deletar um pet cadastrado");
		System.out.println("4.Listar todos os pets cadastrados");
		System.out.println("5.Listar pets por algum critério (idade, nome, raça)");
		System.out.println("6.Sair");

		while(true) {
			System.out.println("Escolha uma opcao:");
			
			char opcao = scanner.next().charAt(0);
			
			if((opcao < '1' || opcao > '6') && opcao == '\b' ) {
				System.out.println("Erro: Digite apenas numeros entre 1 e 6");
			}else if(opcao == '1') {
				System.out.println("Teste");
			}else if(opcao == '6') {
				break;
			}
		}	
	}
}
