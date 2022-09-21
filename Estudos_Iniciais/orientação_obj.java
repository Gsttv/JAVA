

package aplication;
import java.util.Scanner;
public class orientação_obj {

	public static void main(String[] args) {
		
		double xa, xb, xc, ya, yb ,yc;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os ldaos do triangulo X: ");
		xa =  sc.nextDouble();
		xb =  sc.nextDouble();
		xc =  sc.nextDouble();
		
		System.out.println("Digite os ldaos do triangulo Y: ");
		ya =  sc.nextDouble();
		yb =  sc.nextDouble();
		yc =  sc.nextDouble();
		
		double p = (xa+xb+xc)/2;	
		double areax = Math.sqrt(p*(p-xa)*(p-xb)*(p-xc));
		
		
		p = (ya+yb+yc)/2;	
		double areay = Math.sqrt(p*(p-ya)*(p-yb)*(p-yc));
		
		System.out.printf("A area de X:%.4f%n", areax );
		System.out.printf("A area de Y:%.4f%n", areay );
		
		if (areax > areay) {
			System.out.println("A area X eh a maior");
		}else {
			System.out.println("A area Y eh a maior");
		}
	
	
		
		sc.close();
	}

}
