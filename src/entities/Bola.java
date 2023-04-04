package entities;

public class Bola {
	
	static int quantidade_bola = 0;
	private float diametro;
	static final String formato = "Redondo";
	
	public Bola() {
		Bola.quantidade_bola += 1;
	}
	
	public Bola(float diametro) {
		this.diametro = diametro;
		Bola.quantidade_bola += 1;
	}

	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}

	
	
	
	

}
