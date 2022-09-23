import java.util.Scanner;
import Entites.Triangle;

public class Orientação_Obj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite o tamanha do triangulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite o tamanha do triangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c)/2;
		double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
		
		p = (y.a + y.b + y.c)/2;
		double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
		
		System.out.println("area X:" + areaX);
		System.out.println("area Y:" + areaY);
		if (areaX>areaY) {
			System.out.println("area x é a maior");
			
		}
		
		else {
			
			System.out.println("Area y é a maior ");
		}
		sc.close();
	}


}
