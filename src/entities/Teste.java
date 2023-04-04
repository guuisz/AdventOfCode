package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		Elfo elfo4 = new Elfo(3.0,"Adolfo");
		Elfo elfo5 = new Elfo(3.0,"Jose");
		Elfo elfo6 = new Elfo(3.0,"Joao");
		
		List<Elfo> elfos = new ArrayList<>(Arrays.asList(elfo5,elfo4,elfo6));
		
		Collections.sort(elfos);
		
		for(Elfo elfo3 : elfos) {
			System.out.println(elfo3);
		}
		
		comparaNome comparador = new comparaNome();
		
		Collections.sort(elfos, comparador);
		
		for(Elfo elfo3 : elfos) {
			System.out.println(elfo3);
		}

	}

}
