package entities;

import java.util.ArrayList;
import java.util.List;

public class Day6 {

	public static void main(String[] args) {
		
		String linha = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw";
		
		processaCaracteres4("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw");
		processaCaracteres14("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw");

	}

	public static void processaCaracteres4(String linha) {
		for(int i = 0 ; i < linha.length() ; i++) {
			int paradaAtual = i+4;
			if(paradaAtual > linha.length()) {
				paradaAtual = linha.length();
			}
			List<Character> lista = new ArrayList<Character>();
			for(int j = i ; j < paradaAtual ; j++) {
				if(!lista.contains(linha.charAt(j))) {
					lista.add(linha.charAt(j));
				}
				if(lista.size() == 4) {
					System.out.println("ok");
					System.out.println(j+1);
				}
			}
			if(lista.size() == 4) {
				break;
			}
		}
	}
	
	public static void processaCaracteres14(String linha) {
		for(int i = 0 ; i < linha.length() ; i++) {
			int paradaAtual = i+14;
			if(paradaAtual > linha.length()) {
				paradaAtual = linha.length();
			}
			List<Character> lista = new ArrayList<Character>();
			for(int j = i ; j < paradaAtual ; j++) {
				if(!lista.contains(linha.charAt(j))) {
					lista.add(linha.charAt(j));
				}
				if(lista.size() == 14) {
					System.out.println("ok");
					System.out.println(j+1);
				}
			}
			if(lista.size() == 14) {
				break;
			}
		}
	}
	
}
