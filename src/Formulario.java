import java.io.File;
import java.util.Scanner;

public class Formulario {
	
	public  void  chamaFormulario() {
		File file = new File("C:\\Users\\victo\\Java_eclipse\\Projects\\SistemaPet\\src\\Formulario.txt");
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}
	}
}
