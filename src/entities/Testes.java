package entities;

public class Testes {

	public static void main(String[] args) {
		
		Diretorio A = new Diretorio("A");
		Diretorio B = new Diretorio("B");
		Diretorio C = new Diretorio("C");
		
		String add1 = "ls A";
		String add2 = "dir D";
		String add3 = "dir E";
		
		String[] splitedLs = add1.split(" ");
		String[] splitedDir = add2.split(" ");
		
		
	}

}
