package alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com arrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		javaColecoes.adiciona(new Aula("Trabalando com mais arrayList", 32));
        

		List<Aula> aulasImutaveis = javaColecoes.geAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		System.out.println("Antes de ordenar");
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println("Tempo total de aulas :" + javaColecoes.getTempoTotal());
		
		
	}
}
