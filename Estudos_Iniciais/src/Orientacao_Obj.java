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
		
		double areax = x.area();
		double areay = y.area();
		
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
