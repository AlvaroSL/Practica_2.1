package Suma;

public class Resta {
	
	public static int resta(int i, int j){
		return i-j;
	}
	
	public static int resta(int i, int j, int k){
		return resta(resta(i,j), k);
	}

}
