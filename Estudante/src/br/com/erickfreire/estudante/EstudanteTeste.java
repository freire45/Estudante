package br.com.erickfreire.estudante;

public class EstudanteTeste {
	public static void main(String[] args) {
		Estudante est1 = new Estudante("Joao Silva", 93.5);
		Estudante est2 = new Estudante("Maria Souza", 72.75);
		
		System.out.printf("A nota de %s é igual a: %s %n", est1.getNome(), est1.getLetraNota());
		System.out.printf("A nota de %s é igual a: %s %n", est2.getNome(), est2.getLetraNota());
	}

}
