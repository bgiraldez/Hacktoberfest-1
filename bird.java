public class bird {
	// ** atributos o propiedades**//
	private char color;
	private int year;

	// ** metodos de la clase**//
	public void setyear(int e) {
		year = e;
	}

	public void setcolor(char c) {
		color = c;
	}

	public int getyear() {
		return year;
	}
	
	public char getcolor() {
		return color;
	}
	
	public void printyear() {
		System.out.println(year);
	}

	public void printcolor() {
		switch (color) {
		case 'g':
			System.out.println("green");
			break;
		case 'y':
			System.out.println("yellow");
			break;
		case 'g':
			System.out.println("gray");
			break;
		case 'n':
			System.out.println("negro");
			break;
		case 'b':
			System.out.println("black");
			break;
		default:
			System.out.println("color doesn't exist");
			break;
		}
	}
}
