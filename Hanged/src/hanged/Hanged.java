/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanged;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Hanged {
        int r = 0;
    public  static int  strcmp(String[] palabra, String[] respuesta) {
     if(Arrays.equals(palabra, respuesta))
        
    
        

        

            return 0;
            return 0;
    }

public boolean isAlpha(String name) {
    char[] chars = name.toCharArray();

    for (char c : chars) {
        if(!Character.isLetter(c)) {
            return false;
        }
    }

    return true;
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        Hanged hang1= new Hanged();
        
        String []palabras= new String[10];
String[] palabra= new String [10]; 
 String letra="";
 String []respuesta= new String [10];
int j=0,longitud=0,intentos=0,y=0;
j=(int)(Math.random()*4)+1;

        do{
        for(int i=0;i<palabras.length;i++){
        palabras[0]="GATO";
        palabras[1]="PERRO";
        palabras[2]="RATON";
        palabras[3]="PESCADO";
                }
        for(int i=0;i<palabra.length;i++){
        palabra[i]=palabras[j];}
        
         /*for(int i=0;i<palabras.length;i++){
             System.out.println("\n"+palabras[i][0]);
         
         }*/
              longitud=palabra.length;
    
    

    	   //System.out.println(palabra[j]);
    
    
    do{
	

	//textcolor(10);
	           System.out.println("\nBienevenido al juego del ahorcao");
		
	           System.out.println("\nA d i v i n a  l a  p a l a b r a");
			
		          System.out.println("\nIntrodusca una letra======>");
                          
       for(int i=1;i<=longitud;i++){
     String guiones="_";
     guiones+=guiones;
        System.out.println(guiones);

	}
		do{
                    letra=obj.next();
		letra=letra.toUpperCase();
		
		}
		while(!(hang1.isAlpha(letra)));
			//gotoxy(intentos+10,22);
			     System.out.println(letra);
			//gotoxy(25,15);
			     System.out.println("\nEl numero de intentos 20 y llevas [%d]"+intentos+1);
			
			for(int i=0;i<longitud;i++){
				if(letra==palabra[i]){
					//gotoxy(29+i*4,18);
					System.out.println(letra);
					respuesta[i]=letra;
					
					
					
				}
				
				y=strcmp(palabra,respuesta);
				if(y==0){
					
					//gotoxy(25,23);
					 System.out.println("\nCorrecto you win");
					
				}
				
			}
		
		intentos++;
		}
	
	
	while(intentos<20 && y!=0);
	if(intentos==20){
	//gotoxy(26,13);
		 System.out.println("\nPerdiste you lost la palabra hera ===>"+palabra);
		
	}
		//gotoxy(26,25);
	 System.out.println("\nQuiere jugar denuevo (s/n)");
	 letra=obj.next();
        System.out.flush();
        
        }
        while(!(letra.equals("n")));
        }
	}



    

