package entities;

import java.util.Objects;

public class Elfo implements Comparable<Elfo>{
	
	private Double calorias;
	private String name;
	
	public Elfo() {
	}

	public Elfo(Double calorias, String name) {
		super();
		this.calorias = calorias;
		this.name = name;
	}

	public Double getCalorias() {
		return calorias;
	}

	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(calorias);
	}

	@Override
	public String toString() {
		return "Elfo [calorias=" + calorias + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Elfo o) {
		if (o.getCalorias() > this.getCalorias()) {
			return 1;
		} else if (o.getCalorias() < this.getCalorias()){
			return -1;
		}		
		
		return 0;
	}
		
}
