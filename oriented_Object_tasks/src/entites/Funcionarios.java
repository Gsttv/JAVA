package entites;

public class Funcionarios {
	public String name;
	public double salario;
	public double imposto;
	
	public double salario_liquido() {
		return salario - imposto;
	}
	
	public void add_ajust(double perc) {
		this.salario = salario*(perc/100) + salario;
	}
	
	public String toString() {
		return "Nome: " + name + "\n" + "Salario: " + salario_liquido() + "\n" + "Imposto: " + String.format("%.2f",imposto);
	}
	
}
