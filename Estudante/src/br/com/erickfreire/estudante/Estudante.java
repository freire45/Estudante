package br.com.erickfreire.estudante;

/**
 * Programa em Java que simula uma nota para um estudante
 * @author Erick Freire
 * @version 1 - Criado em 03-04-2021 as 19:32
 */

public class Estudante {
	
	private String nome;
	private double media;
	
	public Estudante(String n, double m) {
		this.nome = n;
		
		if(m > 0)
			if(m <= 100)
		        this.media = m;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		if(media > 0)
			if(media <= 100)
		       this.media = media;
	}
	
	public String getLetraNota() {
		String letra = "";
		
		if(this.media >= 90.0)
			letra = "A";
		else if(this.media >= 80.0)
		    letra = "B";
		else if(this.media >= 70.0)
		    letra = "C";
		else if(this.media >= 60.0)
			letra = "D";
		else letra = "F";
		
		
		return letra;
	}
	
	

}
