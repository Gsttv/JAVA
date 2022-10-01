import java.util.Scanner;

import entites.calc_retangulo;

public class area_retangulo {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	calc_retangulo rec=new calc_retangulo();
	
	
	System.out.println("Digite os lados do retangulo");
	System.out.print("Lagura: ");
	rec.width = sc.nextDouble();
	System.out.print("Altura: ");
	rec.height = sc.nextDouble();
	System.out.println();
	double area = rec.area();
	double p = rec.perimetro();
	double diag = rec.diagonal();
	
	System.out.println(rec.toString());
	
	

}
}