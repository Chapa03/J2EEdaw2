package herencia;

public class Hijo extends Padre{
	//Accion heredada del padre
	public void tuerkear() {
		System.out.println("Oook, let's goo!");
	}
	
	//Accion sobrescrita del padre
	public void saludar() {
		System.out.println("Ke ise illo?");
	}
	
	//Accion sobrecargada del padre
	public void saludar(String saludo) {
		System.out.println(saludo);
	}
}
