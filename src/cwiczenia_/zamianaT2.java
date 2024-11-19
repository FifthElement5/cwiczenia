package cwiczenia_;

public class zamianaT2 { 
	public static void main(String[] args) {
		int[] Tablica1d = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[][] Tablica2d = new int[3][4];
		
		for ( int i = 0; i < Tablica1d.length; i++ ) {
		System.out.println(Tablica1d[i]); 
		}
		
		int suma = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				
				
				Tablica2d[i][j] = Tablica1d[4 * i + j];
				suma += Tablica2d[i][j];
				
				
			}
			System.out.println("Suma wiersza:" + i + ":" + suma);
			suma = 0;
			
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
			System.out.println(Tablica2d[i][j]);
			
			
			}
			System.out.println();
		}
	}

}
