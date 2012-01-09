package br.com.forge.model;

public class TesteClass {

	
	public static void main(String[] args){
		
		String nome1 = "rafael";
		String nome2 = "rebeca";
		
		
		if(saoNamorados(nome1, nome2)){
			System.out.println(nome1 + " S2 " + nome2);
		}else{
			System.out.println(":(");
		}
	}

	private static boolean saoNamorados(String nome1, String nome2) {
		return false;
	}	
}