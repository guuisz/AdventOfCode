package entities;

public class Conjunto {
	
	int num1;
	int num2;
	int num3;
	int num4;
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public int getNum4() {
		return num4;
	}

	public void setNum4(int num4) {
		this.num4 = num4;
	}

	@Override
	public String toString() {
		return "Conjunto [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + "]";
	}

	public void criarConjunto(String linha) {
		
		String linhasplited[] = linha.split(",");
		
		String primeiroConjunto[] = linhasplited[0].split("-");
		this.num1 = Integer.parseInt(primeiroConjunto[0]);
		this.num2 = Integer.parseInt(primeiroConjunto[1]);
		
		String segundoConjunto[] = linhasplited[1].split("-");
		this.num3 = Integer.parseInt(segundoConjunto[0]);
		this.num4 = Integer.parseInt(segundoConjunto[1]);

	}
	
	public int comparaConjuntos () {
		
		if(this.num1 <= this.num3 && this.num2 >= this.num4 || this.num3 <= this.num1 && this.num4 >= this.num2) {
			return 1;
		}
		else {
			return 0;
		}
	
}
	
	public int comparaConjuntos2 () {
		if(this.num2 >= this.num3 || this.num2 >= this.num4) {
			if(this.num1 <= this.num3 || this.num1 <= this.num4) {
				return 1;
			} else {
				return 0;
			}
		}
		
		else {
			return 0;
		}
	
}

}
