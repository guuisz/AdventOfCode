package entities;

import java.util.Comparator;

public class comparaNome implements Comparator<Elfo> {

	@Override
	public int compare(Elfo elfo, Elfo elfo2) {
		return elfo.getName().compareTo(elfo2.getName());
	}

}
