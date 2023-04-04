package entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day4 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream stream = new FileInputStream("C:\\Users\\Vinic\\OneDrive\\Documentos\\Conjuntos1.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
		
		int contador = 0;
		
        while(linha != null) {
    		Conjunto conjunto = new Conjunto();
    		conjunto.criarConjunto(linha);
    		
    		if(conjunto.comparaConjuntos2() == 1) {
    			contador += 1;
    		}
 
        	linha = br.readLine();
        }
        
        System.out.println(contador);
        
	}
	

}
