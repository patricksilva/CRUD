package br.com.globalcode.ajtf96.patrick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
	private Connection connection;
	private String sql;
	private Statement statement;
	
	public Crud() {
		try {
			Connection conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
			this.setConnection(conn);
			this.setGetConnectionResult("Conexão realizada com sucesso");
		} catch (SQLException e) {
			this.setGetConnectionResult("ERRO! Falha ao obter conexão");
			e.printStackTrace();
		}
	}
	
	private void setConnection(Connection conn) {
		this.connection = conn;
	}
	
	public String getGetConnectionResult() {
		return this.getConnectionResult;
	}
	
	private void setGetConnectionResult(final String message) {
		this.getConnectionResult = message;
	}
	
	public void create(final String values) {
		try (Statement statement = this.connection.createStatement()) {
			this.setStatement(statement);
			this.setSql(String.format("INSERT INTO jogadores (name, game, pts, dt_record) VALUES (%s)", values));
			this.setGetConnectionResult("SQL INSERT INTO criado com sucesso");
			
			try {
				this.statement.executeUpdate(this.getSql());
				this.setGetConnectionResult("Insert complete.");
			} catch (SQLException e) {
				this.setGetConnectionResult("ERRO! Falha ao executar SQL:" + this.getSql());
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			this.setGetConnectionResult("ERRO! Falha ao criar SQL INSERT INTO");
			e.printStackTrace();
		}
		
	}
	
	private void setStatement(final Statement statement) {
		this.statement = statement;
	}
	
	public String getSql() {
		return this.sql;
	}
	
	private void setSql(final String sql) {
		this.sql = sql;
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
