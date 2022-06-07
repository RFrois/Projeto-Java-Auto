package com.projeto.estudo.java.autocenter;

import java.util.Scanner;

public class Comentario {
// comentário de uma lunha 
/*
 * para comentário de multiplas linas 
 */
/** para comentário docjava 
 * @author rafael (ainda em estudo)
 * @uses 
 */
	
	public static void main(String[] args) {
		//Object system;
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();
		System.out.println();
		 
		teclado.close();
		System.out.println("idade: " + idade + "nome: " + nome + "sobrenome: "+ sobrenome);
	}
}
