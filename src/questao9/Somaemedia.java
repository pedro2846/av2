package questao9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Somaemedia {

	public static void main(String[] args) {
		  
	  	List<Integer> numeros = new ArrayList<Integer>();
	    
	    	int numero;
	      double soma = 0;
	      
	      	// auto-fechamento do Scanner
	        
	        try(Scanner scan = new Scanner(System.in)) {
	   				// looping infinito
	          for(;;) {
	          	System.out.print("Informe um n�mero ou 0 para parar: ");
	            	
	              numero = scan.nextInt();
	              
	              // condi��o de parada
	              
	              if(numero == -1) {
	              	break;
	              }
	              // carregamento do array
	              
	              numeros.add(numero);
	              // calculo da media
	              
	              soma +=numero;
	            }	
	            	          
	      
	        
	        //sa�da da soma dos n�meros
	        System.out.println("\nSoma" + soma);
	        //sa�da da m�dia dos n�meros
	        System.out.println("\nMedia: " + soma / numeros.size());
		
	  	}
	    
	  }
	  
	}
