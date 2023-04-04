package entities;

public class Mochila {
	
	String compartimentoTotal;
	String compartimento1;
	String compartimento2;
	
	public Mochila() {
	}
	
	public Mochila(String compartimentoTotal) {
	this.compartimentoTotal = compartimentoTotal;
	this.compartimento1 = compartimentoTotal.substring(0,compartimentoTotal.length()/2);
	this.compartimento2 = compartimentoTotal.substring(compartimentoTotal.length()/2,compartimentoTotal.length());
	}
	
	public String getCompartimentoTotal() {
		return compartimentoTotal;
	}
	public void setCompartimentoTotal(String compartimentoTotal) {
		this.compartimentoTotal = compartimentoTotal;
	}
	public String getCompartimento1() {
		return compartimento1;
	}
	public void setCompartimento1(String compartimento1) {
		this.compartimento1 = compartimento1;
	}
	public String getCompartimento2() {
		return compartimento2;
	}
	public void setCompartimento2(String compartimento2) {
		this.compartimento2 = compartimento2;
	}

	@Override
	public String toString() {
		return "Mochila [compartimentoTotal=" + compartimentoTotal + ", compartimento1=" + compartimento1
				+ ", compartimento2=" + compartimento2 + "]";
	}
	
	public Character geraCaractere() {
		Character caractere = null;
	
		int contador = 0;
		while(contador < this.compartimento1.length()) {
			if(this.compartimento2.contains(Character.toString(this.compartimento1.charAt(contador)))) {
				caractere = this.compartimento1.charAt(contador);
				break;
			}
			contador += 1;
		}

		return caractere;
		
	}
	
	static Character geraCaractere(String mochila1, String mochila2, String mochila3) {
		Character caractere = null;
		
		int contador = 0;
		
		while(contador < mochila1.length()) {
			if(mochila2.contains(Character.toString(mochila1.charAt(contador)))) {
				if(mochila3.contains(Character.toString(mochila1.charAt(contador)))) {
					caractere = mochila1.charAt(contador);
					break;
				}
			}
			contador += 1;
		}

		return caractere;
		
	}
	
	static int converteCharacter(Character caracter) {
		int intCaractere = caracter;
		if(Character.isLowerCase(caracter)) {
			intCaractere -= 96;
		} else {
			intCaractere -= 38;
		}
		return intCaractere;
	}
	
}
