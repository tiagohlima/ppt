package br.com.edveloso.simple;

public class Tesoura {


	private static int PEDRA = 1, PAPEL = 2, TESOURA =3;

	private int codOponente;

	private String resultado;

   public Tesoura(int codOponente){
   	this.codOponente = codOponente;
   }

	public String getResultado(){
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