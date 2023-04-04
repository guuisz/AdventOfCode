package entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import application.Elfo;

public class Day1 {

	public static void main(String[] args) throws IOException {
		
        
		FileInputStream stream = new FileInputStream("C:\\Users\\Vinic\\OneDrive\\Documentos\\Calorias.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        
        Double calorias = 0.0;
        
        List<Elfo> elfos = new ArrayList<Elfo>();
        
        while(linha != null) {
        	if(linha.isBlank()) {
        		Elfo elf = new Elfo(calorias);
        		elfos.add(elf);
        		calorias = 0.0;
        	} else {
            	calorias += Double.parseDouble(linha);
        	}
        	
            linha = br.readLine();
        }
        
        Collections.sort(elfos);
        
        Double maiorCaloria = elfos.get(0).getCalorias();
        Double somaCalorias = elfos.get(0).getCalorias() + elfos.get(1).getCalorias() + elfos.get(2).getCalorias();
        
        System.out.println(maiorCaloria);
        System.out.println(somaCalorias);
        
	}

}
