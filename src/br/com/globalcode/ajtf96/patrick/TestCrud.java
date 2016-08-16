package br.com.globalcode.ajtf96.patrick;

import org.junit.Assert;
import org.junit.Test;

public class TestCrud {
	
	@Test
	public void deveObterConexao() {
		Crud crud = new Crud();
		Assert.assertEquals(crud.getGetConnectionResult(), "Conexão realizada com sucesso");
	}

}
