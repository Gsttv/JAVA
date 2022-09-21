import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int numero = max(a,b,c);
		showResult(numero);
		sc.close();

	}
	
public static int max (int x, int y, int z) {
	int aux;
	if (x > y && x > z) {
		aux = x;
	} else if (y > x && y > z) {
		aux = y;
	} else {
		aux = z;
	}
	return aux;
}

public static void showResult(int value) {
		
	System.out.println("Higher: " + value);
		
}

}
