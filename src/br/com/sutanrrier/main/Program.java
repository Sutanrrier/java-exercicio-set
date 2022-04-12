package br.com.sutanrrier.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		int qtAlunos;
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();
		
		System.out.print("Quantos alunos possuem o curso A: ");
		qtAlunos = sc.nextInt();
		for(int i=0; i<qtAlunos; i++) {
			cursoA.add(sc.nextInt());
		}
		
		System.out.print("Quantos alunos possuem o curso B: ");
		qtAlunos = sc.nextInt();
		for(int i=0; i<qtAlunos; i++) {
			cursoB.add(sc.nextInt());
		}
		
		System.out.print("Quantos alunos possuem o curso C: ");
		qtAlunos = sc.nextInt();
		for(int i=0; i<qtAlunos; i++) {
			cursoC.add(sc.nextInt());
		}
		
		Set<Integer> alunosCurso = new HashSet<>();
		alunosCurso.addAll(cursoA);
		alunosCurso.addAll(cursoB);
		alunosCurso.addAll(cursoC);
		
		System.out.println("\nQuantidade total de alunos: " + alunosCurso.size());
		
		sc.close();
	}

}
