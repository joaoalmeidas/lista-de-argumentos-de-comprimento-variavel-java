import java.util.Random;

public class Multiplicacao {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] arrayUm = new int[2];
		int[] arrayDois = new int[4];
		int[] arrayTres = new int[6];
		int res;
		
		inicializaArray(arrayUm, random);
		inicializaArray(arrayDois, random);
		inicializaArray(arrayTres, random);
		
		System.out.println("Array 1");
		exibeArray(arrayUm);
		res = produto(arrayUm);
		System.out.printf("Produto dos elementos do Array 1: %d.\n\n", res);
		
		System.out.println("Array 2");
		exibeArray(arrayDois);
		res = produto(arrayDois);
		System.out.printf("Produto dos elementos do Array 2: %d.\n\n", res);
		
		System.out.println("Array 3");
		exibeArray(arrayTres);
		res = produto(arrayTres);
		System.out.printf("Produto dos elementos do Array 3: %d.\n\n", res);
		
	}
	
	public final static int produto(int... numeros){
		int res = numeros[0];
		
		for(int i = 1; i < numeros.length; i++){
			res *= numeros[i];
		}
		
		return res;
	}
	
	public final static void exibeArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
	
	public final static void inicializaArray(int[] array, Random random){
		for(int i = 0; i < array.length; i++){
			array[i] = 1 + random.nextInt(10);
		}
	}

}
