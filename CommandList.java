package scl.edu.gt;

public class CommandList {
	
	String Information [] = new String [7];
	String command [] = new String [7];
	String sistemas [] = new String [5];
	String sistemasInfo [] = new String [5];
	
	CommandList(){
		command[0]= "+";
		command[1]= "-";
		command[2]= "/";
		command[3]= "*";
		command[4]= "%";
		command[5]= "help";
		command[6]= "exit";
		
		Information[0]= " Este comando puede sumar dos números";
		Information[1]= " Este comando puede restar dos números";
		Information[2]= " Este comando puede dividir dos numeros";
		Information[3]= " Este comando nos ayuda a multiplicar dos numeros";
		Information[4]= " Este comando puede darnos una porción que queda \n de un todo después de quitar otra parte.";
		Information[5]= " Este comando nos brinda información sobre de los comandos";
		Information[6]= " Este comando nos ayuda a detener el programa";
		
		sistemas[0]= "BIOS";
		sistemas[1]= "Kernel";
		sistemas[2]= "CPU";
		sistemas[3]= "Hardware";
		sistemas[4]= "Software";
		
		sistemasInfo[0]= " Este comando da información sobre este componente​";
		sistemasInfo[1]= " Este comando da información sobre este componente​";
		sistemasInfo[2]= " Este comando da información sobre este componente​";
		sistemasInfo[3]= " Este comando da información sobre este componente​";
		sistemasInfo[4]= " Este comando da información sobre este componente​";
	}
}
