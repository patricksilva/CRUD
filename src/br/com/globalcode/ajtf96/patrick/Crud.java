package br.com.globalcode.ajtf96.patrick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Patrick Alex - patrickalex@gmail.com
 * CRUD is a Database Patterns designed to organize the persistence operations 
 * of an application into Create, Retrieve, Update, and Delete operations that
 * are implemented by a persistence layer.
 * 
 * */
public class Crud {
	
	private static final String NOME_BANCO = "aj";
	private static final String STR_CON = "jdbc:mysql://localhost:3306/" + NOME_BANCO;
	private static final String USER = "aj";
	private static final String PASSWORD = "ajtf96%";
	private String getConnectionResult="";
	
	public Crud() {
		try (Connection conn = DriverManager.getConnection(STR_CON, USER, PASSWORD)) {
			this.setGetConnectionResult("Conex�o realizada com sucesso");
		} catch (SQLException e) {
			this.setGetConnectionResult("ERRO! Falha ao obter conex�o");
			e.printStackTrace();
		}
	}
	
	public String getGetConnectionResult() {
		return this.getConnectionResult;
	}
	
	private void setGetConnectionResult(final String message) {
		this.getConnectionResult = message;
	}
	
	public void create() {
		//TODO
	}
	
	public void read() {
		//TODO
	}
	
	public void update() {
		//TODO
	}
	
	public void delete() {
		//TODO
	}

}
