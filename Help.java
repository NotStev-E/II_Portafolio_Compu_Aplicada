package scl.edu.gt;

import java.util.Scanner;

public class Help {
	public static void CommandList() {
		CommandList data = new CommandList();
		
		int cantidadDeComandos = data.command.length;
		
		System.out.println("Todos los comandos disponibles son: ");
		for(var i = 0;i < cantidadDeComandos;i++) {
			System.out.print(""+data.command[i]+" | ");
		}
		System.out.println("");
	}
}
