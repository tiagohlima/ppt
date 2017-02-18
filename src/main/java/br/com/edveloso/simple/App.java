package br.com.edveloso.simple;
import java.util.*;
import java.io.*;
/**
 * Hello world!
 *
 */
public class App 
{	
    private static int PEDRA = 1, PAPEL = 2, TESOURA =3;

    public static void main( String[] args ) throws IOException
    {

		final String ANSI_CLS = "\u001b[2J";
    	final String ANSI_HOME = "\u001b[H";
    	System.out.print(ANSI_CLS + ANSI_HOME);
    	System.out.flush();
    	int pontoComputador = 0;
    	int pontoDesafiante = 0;


    	while(true){
	        System.out.println( "Papel pedra tesoura!" );
	        System.out.println("Escolha um dos tres!");
	        Scanner scan = new Scanner(System.in);
	        String escolha = scan.nextLine();
	        
	        int codigo = Tipo.getTipoPor(escolha).getCodigo();
	        int codOponente = 0;
	        while(codOponente <= 0 ){
	        	codOponente = new Random().nextInt(3);
	        }	        
        	System.out.print(ANSI_CLS + ANSI_HOME);
        	System.out.flush();
        	System.out.println("Eu escolhi: " + escolha.toUpperCase());
			System.out.println("O cumputador escolheu: " + Tipo.getTipoPor(codOponente));

			String resultado = new String();
	        switch(codigo){
	        	case 1:
	        		resultado = getResultadoPedra(codOponente);
	        		System.out.println(resultado);		        		
	        		break;
	        	case 2:
	        		resultado = getResultadoPapel(codOponente);
	        		System.out.println(resultado);		        		
	        		break;	        		
	        	case 3:
	        		resultado = getResultadoTesoura(codOponente);
	        		System.out.println(resultado);		        			        		
	        		break;

	        }
	        if(resultado.contains("venci")){
	        	pontoDesafiante++;
	        }
	        else if (resultado.contains("perdi")){
	        	pontoComputador++;
	        }
	        System.out.println("Pontos desafiante: "+ pontoDesafiante+ " Pontos Computador: "+ pontoComputador);
	        System.out.println("Quer jogar de novo?");

	   }     


    }

	public static String getResultadoPapel(int codOponente){
		 if(PEDRA == codOponente){
		   	System.out.println("Papel embrulha a pedra!");
		   	  return "Eu venci!";
		   }
		   if(TESOURA == codOponente){
		   	  System.out.println("Tesoura corta papel!");
		   	 return "Eu perdi!";
		   }
		   return "empate";
	}

    public static String getResultadoPedra(int codOponente){
	   if(TESOURA == codOponente){
	   	  System.out.println("A pedra quebra a tesoura!");
	   	  return "Eu venci!";
	   }
	   if(PAPEL == codOponente){
	   	System.out.println("O papel embrulha a pedra!");
	   	 return "Eu perdi!";
	   }
	   return "empate";
	}

	public static String getResultadoTesoura(int codOponente){
	   if(PAPEL == codOponente){
	   	  System.out.println("Tesoura corta papel!");
	   	  return "Eu venci!";
	   }
	   if(PEDRA == codOponente){
	   	System.out.println("A pedra quebra a tesoura!");
	   	 return "Eu perdi!";
	   }
	   return "empate";
	}

}
