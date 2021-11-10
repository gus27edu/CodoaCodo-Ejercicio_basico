import java.util.*;

public class Main {

	public static void main(String[] args) {

		/**TODO
		 * Crear un programa en java en el cual se pida al usuario ingresar su nombre, apellido, edad, hobbie, editor de código 
		 * preferido, sistema operativo que utiliza, luego deberá mostrarse por consola los datos ingresados. 
		 * El programa debe ser subido a un repositorio de GitHub, pegar el link del ejercicio resuelto en el siguiente recuadro.
		 */
		
		String nombre;
		String apellido;
		int edad;
		String hobbie;
		String IDE;
		String SO;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bienvenido al sistema \n");

		System.out.println("Ingrese su nombre:");
		nombre = input.nextLine();

		System.out.println("Ingrese su apellido:");
		apellido = input.nextLine();
		
		System.out.println("Ingrese su edad:");
		edad = Integer.parseInt(input.nextLine());
//	    input.nextInt();

		System.out.println("Ingrese su hobbie: ");
		hobbie = input.nextLine();
		
		System.out.println("Ingrese su editor de texto favorito:");
		IDE = input.nextLine();
		
		System.out.println("Ingrese su S.O. preferido:");
		SO = input.nextLine();
		
		System.out.println("Datos ingresados:\nNombre: \t" + nombre + "\nApellido: \t" + apellido + "\nEdad: \t\t" + edad + "\nHobbie: \t" + hobbie + "\nIDE: \t\t" + IDE + "\nSO: \t\t" + SO);

		input.close();
	}

}
