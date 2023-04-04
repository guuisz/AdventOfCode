package entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream stream = new FileInputStream("C:\\Users\\Vinic\\OneDrive\\Documentos\\PedraPapelTesoura.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        
		PedraPapelTesoura jogo = new PedraPapelTesoura();
		int pontosConquistadosJogo1 = 0;
        int pontosConquistadosJogo2 = 0;

        while(linha != null) {
        	pontosConquistadosJogo1 += jogo.iniciaJogo(linha.charAt(0), linha.charAt(2));
        	pontosConquistadosJogo2 += jogo.iniciaJogo2(linha.charAt(0), linha.charAt(2));
        	linha = br.readLine();
        }
        
        System.out.println(pontosConquistadosJogo1);
        System.out.println(pontosConquistadosJogo2);

	}

}
