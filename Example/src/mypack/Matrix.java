package mypack;

public class Matrix {
    public static void main(String[] args) {
    	int matrix[][] = new int[3][4];
    	for(int i = 0; i < 3; i++) {
    		for(int j = 0; j < 4; j++) {
        		matrix[i][j] = (i+1) * (j+1);
        	}
    	}
    	for(int i = 0; i < 3; i++) {
    		for(int j = 0; j < 4; j++) {
            	System.out.print(matrix[i][j]);
            	System.out.print(" ");
        	}
        	System.out.println();
    	}
    }
}