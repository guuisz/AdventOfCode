package entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Day7 {

	public static void main(String[] args) throws IOException, CloneNotSupportedException {

		FileInputStream stream = new FileInputStream("C:\\Users\\Vinic\\OneDrive\\Documentos\\Diretorios.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();

		Diretorio diretorioPadrao = new Diretorio("/");

		linha = br.readLine();
		linha = br.readLine();
		while(!linha.contains("$")) {
			if(!linha.contains("$")) {
				if(linha.contains("dir") ) {
					String[] linhaSplited = linha.split(" ");
					diretorioPadrao.ls(new Diretorio(linhaSplited[1]));
				} else {
					String[] linhaSplited = linha.split(" ");
					diretorioPadrao.ls(new Arquivo(linhaSplited[1],Integer.parseInt(linhaSplited[0])));
				}
			}
			linha = br.readLine();
		}
		
		String diretorio = null;

		while(linha != null) {
			String[] linhaQuebrada = linha.split(" ");
			if(linha.contains("cd")) {
				diretorio = linhaQuebrada[2];
			}
			
			else if(linhaQuebrada.length == 2 && !linha.contains("$")) {
				System.out.println(linha);
			}
			
			linha = br.readLine();
		}

	}

}


