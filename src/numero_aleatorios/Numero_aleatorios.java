package numero_aleatorios;

import java.util.Random;

public class Numero_aleatorios {
	
	public static void main (String [] args){
			
		Random random = new Random();
		int valor;
		
		for(int i = 0; i < 20; i++) {
			valor = random.nextInt(11);
			System.out.println(valor);
		}
	}

}
