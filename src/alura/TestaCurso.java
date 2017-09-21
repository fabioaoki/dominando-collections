package alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "paulo silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com arrayList", 21));
		javaColecoes.adiciona(new Aula("Tranalhando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        
		System.out.println();
		
		System.out.println(javaColecoes.getAulas());
		
		System.out.println("----------------");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		javaColecoes.getAulas().add(new Aula("Trabalhando com arrayList", 21));
		System.out.println(aulas);
	}
}
