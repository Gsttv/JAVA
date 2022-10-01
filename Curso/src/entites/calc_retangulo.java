package entites;

public class calc_retangulo {
	public double height;
	public double width;

	public double perimetro() {
		return height * 2 + width * 2;
	}

	public double area() {
		return height * width;
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	public String toString() {
		return "A area é de: " + String.format("%.2f", area()) + "\n" + "O perimetro é: "
				+ String.format("%.2f", perimetro()) + "\n" + "A diagonal é: " + String.format("%.2f", diagonal());

	}
}
