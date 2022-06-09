package com.projeto.estudo.java.autocenter;

import java.util.Scanner;

public class Comentario {
// coment�rio de uma lunha 
/*
 * para coment�rio de multiplas linas 
 */
/** para coment�rio docjava 
 * @author rafael (ainda em estudo)
 * @uses 
 */
	
	public static void main(String[] args) {
		//Object system;
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println();
		
		System.out.println("Qual o seu nome?");		
		String nome = teclado.nextLine();
		
		
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();
		System.out.println();
		 
		teclado.close();
		System.out.println("idade: " + idade + " " + "nome: " + nome + "sobrenome: "+ sobrenome);
	}
}
