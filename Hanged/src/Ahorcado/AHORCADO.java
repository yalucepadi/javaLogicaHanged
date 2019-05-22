/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;
import java.util.Random;
/**
 *
 * @author Administrador
 */
public class AHORCADO {
    	private String palabra = "", Solucion = "";
	private int pos = -1, intentos = 0, maxintentos = 6;
	private String [] PALABRAS = {"GATO", "PERRO", "ELEFANTE", "CASA", "AUTOMOVIL", 
			"ESCUELA", "MALCOM IN THE MIDDLE"};
	public int Gano = -1;
 
	public void Iniciar()
	{
		Random R = new Random();
		int x = -1;
		do{
			x = R.nextInt(PALABRAS.length);
		}while(pos == x);
		pos = x;
		palabra = PALABRAS[pos];
 
		for(x = 0; x < palabra.length(); x++)
		{
			if(palabra.charAt(x) != ' ')
				Solucion += "_";
			else
				Solucion += " ";			
		}
		//SOP(palabra);
		Dibujar();			
	}
 
	public void BuscarLetra(char pal)
	{
		String Sol1 = Solucion;
		Solucion = "";
		for(int x = 0; x < palabra.length(); x++)
		{
			if(palabra.charAt(x) != ' ')
			{
				if(pal == palabra.charAt(x))
					Solucion += pal;
				else				
					Solucion += Sol1.charAt(x);				
			}else
				Solucion += ' ';
		}
 
		if(Sol1.compareTo(Solucion) == 0 && Solucion.indexOf(pal) == -1)
			intentos++;
 
		Dibujar();
		if(Solucion.compareTo(palabra) == 0)
		{
			Gano = 0;
			SOP("Usted ha GANADO!!!! ;D");
		}else if(intentos == maxintentos){
			Gano = 1;
			SOP("Usted ha perdido!!! ");
		}
	}
 
	private void Dibujar()
	{
		for(char c: Solucion.toCharArray())
			System.out.print(c + " ");
		SOP("");
		SOP("\nIntentos restantes: " + (maxintentos - intentos));
	}
 
	public void SOP(String msj)
	{
		System.out.println(msj);	
	}
 
}
