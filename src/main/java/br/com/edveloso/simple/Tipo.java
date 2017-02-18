package br.com.edveloso.simple;
public enum Tipo {
	
   PEDRA(1),PAPEL(2),TESOURA(3);
   
   private int codigo;

   private Tipo(int codigo){
   	  this.codigo = codigo;
   }

   public int getCodigo(){
   	  return this.codigo;
   }

   public static Tipo getTipoPor(int codigo){

   	if(1 == codigo){
  		return PEDRA;
  	}
  	else{
  		if(2 == codigo){
  			return PAPEL;
  		}else{
  		if(3 == codigo ){
  			return TESOURA;
  		}
  	}
  	return null;
  	}

   }

  public static Tipo getTipoPor(String nome){
  	if("pedra".equalsIgnoreCase(nome)){
  		return PEDRA;
  	}
  	else{
  		if("papel".equalsIgnoreCase(nome)){
  			return PAPEL;
  		}else{
  		if("tesoura".equalsIgnoreCase(nome)){
  			return TESOURA;
  		}
  	}
  	return null;
  	}

}
}