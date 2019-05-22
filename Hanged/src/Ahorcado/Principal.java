/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import Ahorcado.AHORCADO;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        		Scanner Leer = new Scanner(System.in);
		AHORCADO A = new AHORCADO();
		String letra = "";
		char Letra;
		int op = -1;
		do{	
			if(op == -1)
				op = 1;
			else{
				A.SOP("\n[1] - Jugar de Nuevo\n[0] - Salir");
				op = Leer.nextInt();
			}
 
 
			switch(op)
			{
				case 1:
					A.Iniciar();
					while(A.Gano == -1)
					{
						letra = Leer.next().toUpperCase();
						Letra = letra.charAt(0);
						A.BuscarLetra(Letra);
					}
					break;
				case 0:
					break;
				default:
					A.SOP("Opcion Indefinida!");
			}
 
		}while(op != 0);
 
    }
    //https://foro.elhacker.net/java/ayuda_con_este_metodo-t340776.0.html
}
