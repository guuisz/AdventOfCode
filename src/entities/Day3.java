package entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day3 {

	public static void main(String[] args) throws IOException {
		FileInputStream stream = new FileInputStream("C:\\Users\\Vinic\\OneDrive\\Documentos\\Mochilas.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();

		int num = 0;
		List<Mochila> mochilas = new ArrayList<Mochila>();
		int num2 = 0;

		while (linha != null) {
			Mochila mochila = new Mochila(linha);
			mochilas.add(mochila);
			num += Mochila.converteCharacter(mochila.geraCaractere());
			if (mochilas.size() == 3) {
				num2 += Mochila.converteCharacter(Mochila.geraCaractere(mochilas.get(0).compartimentoTotal,
						mochilas.get(1).compartimentoTotal, mochilas.get(2).compartimentoTotal));
				mochilas.clear();
			}
			linha = br.readLine();
		}

		System.out.println(num);
		System.out.println(num2);

	}

}
