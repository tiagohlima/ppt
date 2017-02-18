package br.com.edveloso.simple;

public class Papel {

	private static int PEDRA = 1, PAPEL = 2, TESOURA =3;

	private int codOponente;

	private String resultado;

   public Papel(int codOponente){
   	this.codOponente = codOponente;
   }

	public String getResultado(){
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


}