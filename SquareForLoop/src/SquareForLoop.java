import java.util.Scanner;

public class SquareForLoop {

	public static void main(String[] args) {
		
		int x, y;
		
		//build scanner
		Scanner in = new Scanner(System.in);
		
		//height square
		System.out.println("Please type height for your square: ");
		x = in.nextInt();
		
		while(x <= 0 || x > 100) {
			System.out.println("ERROR, TRY AGAIN!");
			x = in.nextInt();
		}

		if(x >= 1 && x <= 100) {
			System.out.println("ACCEPTED \n");
		}
		
		//width square
		System.out.println("Please type width for your square: ");
		y = in.nextInt();
		
		while(y <= 0 || y > 100) {
			System.out.println("ERROR, TRY AGAIN!");
			y = in.nextInt();
		}

		if(y >= 1 && y <= 100) {
			System.out.println("ACCEPTED \n");
			in.close();
		}
		
		//loop creating square
        for (int i = 1; i <= x; i++ ){
        	
        	for (int n = 1; n <= y; n++ ){
            	System.out.print("* ");
            	
            }
        	System.out.println();
        }
        
	}

}
