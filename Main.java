package scl.edu.gt;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		/*INSTANCIAS DE CLASE*/
		CommandList commandData = new CommandList();
		ArithmeticFunctions resultado = new ArithmeticFunctions();
		Help help = new Help();
		
		/*MENSAJE INICIAL DEL PROGRAMA*/
		Img txt = new Img();
		txt.Mensaje();
		
		System.out.println("");
		
		boolean bucle = true;
		
		/*BUCLE DEL PROGRAMA*/
				
			do{
				Scanner inputCommand = new Scanner(System.in);
				System.out.println("");
				System.out.print("~$: ");
				String output = inputCommand.nextLine();
				
				if(output.equals(commandData.command[0])){
					resultado.suma();
				}else if(output.equals(commandData.command[1])) {
					resultado.resta();
				}else if(output.equals(commandData.command[2])) {
					resultado.division();
				}else if(output.equals(commandData.command[3])) {
					resultado.multiplicacion();
				}else if(output.equals(commandData.command[4])) {
					resultado.residuo();
				}else if(output.equals(commandData.command[5])){
					help.CommandList();
				}else if(output.equals(commandData.command[6])) {
					bucle = false;
				}else{
					System.out.println("No se ha encontrado el comando "+"~"+output+".");
					System.out.println("Ingresa el comando ~help para ver toda la información sobre los comandos disponibles.");
				}
			}while(bucle);
				
		System.out.println("El programa ha finalizado");

	}

}
