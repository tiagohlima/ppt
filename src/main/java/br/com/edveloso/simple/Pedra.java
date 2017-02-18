package br.com.edveloso.simple;

public class Pedra {

	private static int PEDRA = 1, PAPEL = 2, TESOURA =3;

	private int codOponente;

	private String resultado;

   public Pedra(int codOponente){
   	this.codOponente = codOponente;
   }

	public String getResultado(){
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


}