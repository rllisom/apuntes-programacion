package HolaMundo;

public class HolaMundo {
	
	public static void main(String[] args) {
		System.out.println("Hello World all the World");

		int[] array = new int[4];
		array[0] = 123;
		array[1] = 456;
		array[2] = 789;
		array[3] = 999;

		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
//Array que imprime por pantalla los número de la lista
		for (int x : array) {
			System.out.println(x);
		}


		System.out.println("\n\n\n");
		int[] arr = new int[] {123, 456, 789};

		for(int a: arr) {
			System.out.println(a);
		}


	}

}
