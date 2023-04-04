package entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day5 {

	public static void main(String[] args) throws IOException {

		FileInputStream stream = new FileInputStream("C:\\Users\\Vinic\\OneDrive\\Documentos\\Teste.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();

		LinkedList<Character> A = new LinkedList<Character>();
		LinkedList<Character> B = new LinkedList<Character>();
		LinkedList<Character> C = new LinkedList<Character>();
		LinkedList<Character> D = new LinkedList<Character>();
		LinkedList<Character> E = new LinkedList<Character>();
		LinkedList<Character> F = new LinkedList<Character>();
		LinkedList<Character> G = new LinkedList<Character>();
		LinkedList<Character> H = new LinkedList<Character>();
		LinkedList<Character> I = new LinkedList<Character>();

		List<LinkedList<Character>> listas = new ArrayList<>();

		listas.add(A);
		listas.add(B);
		listas.add(C);
		listas.add(D);
		listas.add(E);
		listas.add(F);
		listas.add(G);
		listas.add(H);
		listas.add(I);

		while(linha.charAt(1) != '1') {
			if(linha.charAt(1) != ' ') {
				listas.get(0).add(linha.charAt(1));
			}
			if(linha.charAt(5) != ' ') {
				listas.get(1).add(linha.charAt(5));
			}
			if(linha.charAt(9) != ' ') {
				listas.get(2).add(linha.charAt(9));
			}
			if(linha.charAt(13) != ' ') {
				listas.get(3).add(linha.charAt(13));
			}
			if(linha.charAt(17) != ' ') {
				listas.get(4).add(linha.charAt(17));
			}
			if(linha.charAt(21) != ' ') {
				listas.get(5).add(linha.charAt(21));
			}
			if(linha.charAt(25) != ' ') {
				listas.get(6).add(linha.charAt(25));
			}
			if(linha.charAt(29) != ' ') {
				listas.get(7).add(linha.charAt(29));
			}
			if(linha.charAt(33) != ' ') {
				listas.get(8).add(linha.charAt(33));
			}
			linha = br.readLine();
		}

		while(linha != null ) {
			if(!linha.isBlank()) {
				if(linha.charAt(0) == 'm') {
					String linhasplited[] = linha.split(" ");
					CreateMover9001(listas,Integer.parseInt(linhasplited[1]),Integer.parseInt(linhasplited[3]),Integer.parseInt(linhasplited[5]));
				}
			}

			linha = br.readLine();
		}
		
		printaLista(listas);
		
	}

	public static void CreateMover9000(List<LinkedList<Character>> listas , int quantidadeAPassar, int estoqueRetirado , int estoqueRecebido) {
		estoqueRetirado -= 1;
		estoqueRecebido -= 1;

		for(int i = 0 ; i < quantidadeAPassar ; i++) {
			listas.get(estoqueRecebido).addFirst(listas.get(estoqueRetirado).getFirst());
			listas.get(estoqueRetirado).removeFirst();
		}
	}
	
	public static void CreateMover9001(List<LinkedList<Character>> listas , int quantidadeAPassar, int estoqueRetirado , int estoqueRecebido) {
		estoqueRetirado -= 1;
		estoqueRecebido -= 1;
		
		LinkedList<Character> listaParaPassar = new LinkedList<Character>();

		for(int i = 0 ; i < quantidadeAPassar ; i++) {
			listaParaPassar.add(listas.get(estoqueRetirado).getFirst());
			listas.get(estoqueRetirado).removeFirst();
		}
		
		for(int i = 0 ; i < quantidadeAPassar ; i++) {
			listas.get(estoqueRecebido).addFirst(listaParaPassar.getLast());
			listaParaPassar.removeLast();
		}
	}
	
	public static void printaLista(List<LinkedList<Character>> listas) {
		int maiorLista = listas.get(0).size();
		
		for(int i = 0 ; i < listas.size() ; i++) {
			if(maiorLista < listas.get(i).size()) {
				maiorLista = listas.get(i).size();
			}
		}
		

		for(int i = 0 ; i < listas.size() ; i++) {
			if(listas.get(i).size() < maiorLista) {
				for(int j = listas.get(i).size() ; j < maiorLista ; j++) {
					listas.get(i).add(' ');
				}
			}
		}
		
		for(int i = 0 ; i < maiorLista ; i++) {
			for(int j = 0 ; j < listas.size() ; j++) {
				System.out.print(listas.get(j).get(i));
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}

}
