package herencia;

public class Main {

	public static void main(String[] args) {
		System.out.println("Acciones del padre:");
		Padre padre = new Padre();
		padre.andar();
		padre.saludar();
		
		System.out.println("\nAcciones del hijo:");
		Hijo hijo = new Hijo();
		hijo.andar();
		hijo.tuerkear();
		hijo.saludar();
		hijo.saludar("Vamos loookoooo!!!");
	}

}
