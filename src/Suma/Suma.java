package Suma;

public class Suma {
	
	public static int sum(int i, int j){
		return i+j;
	}
	
	public static int sum(int i, int j, int k){
		return sum(sum(i,j), k);
	}

}
