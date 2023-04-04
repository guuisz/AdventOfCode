package entities;

import java.util.ArrayList;
import java.util.List;

public class Diretorio {

	private List<Diretorio> diretorios = new ArrayList<Diretorio>();
	private List<Arquivo> arquivos = new ArrayList<Arquivo>();
	private String nome;
	private int tamanho;

	public Diretorio(String nome) {
		this.nome = nome;
		this.tamanho = 0;
	}

	public Diretorio() {
	}

	public List<Diretorio> getDiretorios() {
		return diretorios;
	}
	public void setDiretorios(List<Diretorio> diretorios) {
		this.diretorios = diretorios;
	}
	public List<Arquivo> getArquivos() {
		return arquivos;
	}
	public void setArquivos(List<Arquivo> arquivos) {
		this.arquivos = arquivos;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void ls(Arquivo arq) {
		this.tamanho += arq.getTamanho(); 
		this.arquivos.add(arq);
	}

	public void ls(Diretorio dir) {
		this.diretorios.add(dir);
	}

	public void adicionarArquivo(String dir, String linha) {
		for(int i = 0 ; i < this.diretorios.size() ; i++) {
			if(this.diretorios.get(i).nome.equals(dir)) {
				if(linha.contains("dir")) {
					String[] linhaSplited = linha.split(" ");
					Diretorio d = new Diretorio(linhaSplited[1]);
					this.diretorios.get(i).ls(d);
				}
				else {
					String[] linhaSplited = linha.split(" ");
					Arquivo arq = new Arquivo(linhaSplited[1],Integer.parseInt(linhaSplited[0]));
					this.diretorios.get(i).ls(arq);
				}
			}
			else {
				this.diretorios.get(i).adicionarArquivo(dir, linha);
			}
		}

	}
	
	public Diretorio adicionaDiretorio(String dir, List<String> linha) {
		Diretorio d = new Diretorio(dir);
		
		for(String l : linha) {
			String[] linhaSplited = l.split(" ");
			Arquivo arq = new Arquivo(linhaSplited[1],Integer.parseInt(linhaSplited[0]));
			d.ls(arq);
		}
		
		return d;
	}


	public void retornaDiretorio() {
		
		for(int i = 0 ; i < this.diretorios.size() ; i++) {
				this.tamanho += this.diretorios.get(i).tamanho;
				this.diretorios.get(i).retornaDiretorio();
		}
	}
	
	public void retornaDiretorio2() {
		
		for(int i = 0 ; i < this.diretorios.size() ; i++) {
				this.tamanho += this.diretorios.get(i).tamanho;
		}
	}

}
