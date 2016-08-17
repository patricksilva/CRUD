package br.com.globalcode.ajtf96.patrick;

import org.junit.Assert;
import org.junit.Test;

public class TestCrud {
	
	@Test
	public void deveObterConexao() {
		Crud crud = new Crud();
		Assert.assertEquals("Conexão realizada com sucesso", crud.getGetConnectionResult());
	}
	
	@Test
	public void deveCriarNovoRegistro() {
		Crud crud = new Crud();
		crud.create("'bianca', 'mathtrainer', 5, now()");
		Assert.assertEquals("Insert complete.", crud.getGetConnectionResult());
	}

}
