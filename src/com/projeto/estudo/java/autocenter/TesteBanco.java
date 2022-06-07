package com.projeto.estudo.java.autocenter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteBanco {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/complementar?verifyServerCertificate=false&userSSL=true";
		String usuario = "root";
		String senha = "admin";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
        
		System.out.println("Conexão efetuada.");
		conexao.close(); 
		
				
		//DESKTOP-Q12GHS5 DESKTOP-Q12GHS5\rafae jar191016
	}

}
