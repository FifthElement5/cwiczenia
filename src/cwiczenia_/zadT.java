package cwiczenia_;

public class zadT {
	public static void main (String[] args) {
		
		int[] Array1d = {1, 2, 3, 4, 5, 6};
		int[][] Array2d = new int [2][3];
		
		for(int i = 0 ; i < Array1d.length; i++) {
			
			System.out.println(Array1d[i]);
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				Array2d[i][j] = Array1d[i*3 + j];
			}
			
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
			System.out.println(Array2d[i][j]);
			}
			
		}
		
		
	}

}
