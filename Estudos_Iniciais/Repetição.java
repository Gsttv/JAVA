import java.util.Locale;
import java.util.Scanner;

public class Repetição {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o codigo de combustivel: ");
		int combustivel = sc.nextInt();
		int alcool = 0;
		int diesel = 0;
		int gasolina = 0;
	
		while (combustivel != 4 && combustivel <= 4) {
			System.out.println("informe o codigo de combustivel ou aperte 4 para encerrar: ");
			if (combustivel == 1) {
				alcool++;
			} else if (combustivel == 2) {
				gasolina++;
			} else if (combustivel == 3) {
				diesel++;
			}
			combustivel = sc.nextInt();
		}
		
		System.out.println("mutio obrigado");
		System.out.println("Alcool: " + alcool);
		sc.close();
	}
}