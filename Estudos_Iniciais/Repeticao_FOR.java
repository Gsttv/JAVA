import java.util.Scanner;

public class Repeticao_FOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int in = 0;		
		int out = 0;
			for (int i = 0; i < x; i++) {
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double c = sc.nextDouble();
				
				double media = (a*2 + b*3 + c*5)/10;
				System.out.printf("%.1f", media);
				}

	
		sc.close();
	}
}
