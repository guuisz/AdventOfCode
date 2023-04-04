package entities;

public class PedraPapelTesoura {
	
	public int iniciaJogo(Character inimigo, Character eu) {
	
		int pontosConquistados = 0;
		
		switch(eu) {
		case 'Y':
			pontosConquistados += 2;
			
			if(inimigo == 'A') {
				pontosConquistados += 6;
			}
			if(inimigo == 'B') {
				pontosConquistados += 3;
			}
			if(inimigo == 'C') {
				pontosConquistados += 0;
			}
			break;
		case 'X':
			pontosConquistados += 1;
			
			if(inimigo == 'A') {
				pontosConquistados += 3;
			}
			if(inimigo == 'B') {
				pontosConquistados += 0;
			}
			if(inimigo == 'C') {
				pontosConquistados += 6;
			}
			break;
			
		case 'Z':
			pontosConquistados += 3;
			
			if(inimigo == 'A') {
				pontosConquistados += 0;
			}
			if(inimigo == 'B') {
				pontosConquistados += 6;
			}
			if(inimigo == 'C') {
				pontosConquistados += 3;
			}
			break;
		}
		
		return pontosConquistados;
	}
	
	public int iniciaJogo2(Character inimigo, Character eu) {
		int pontosConquistados = 0;
		
		switch(eu) {
		case 'Y':
			
			if(inimigo == 'A') {
				pontosConquistados += 3 + 1;
			}
			if(inimigo == 'B') {
				pontosConquistados += 3 + 2;
			}
			if(inimigo == 'C') {
				pontosConquistados += 3 + 3;
			}
			break;
		case 'X':
			
			if(inimigo == 'A') {
				pontosConquistados += 0 + 3;
			}
			if(inimigo == 'B') {
				pontosConquistados += 0 + 1;
			}
			if(inimigo == 'C') {
				pontosConquistados += 0 + 2;
			}
			break;
			
		case 'Z':
			
			if(inimigo == 'A') {
				pontosConquistados += 6 + 2;
			}
			if(inimigo == 'B') {
				pontosConquistados += 6 + 3;
			}
			if(inimigo == 'C') {
				pontosConquistados += 6 + 1;
			}
			break;
		}
		
		
		return pontosConquistados;
	}

}
