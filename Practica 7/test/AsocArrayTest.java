
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AsocArrayTest {

	@Before
	public void setUp(){
		al = new AsocArray();
	}
	
	@Test
	public void AñadirEntradaEnElArrayList(){

		al.put("primero","uno");
		assertEquals("uno",al.get("primero"));		
		
	}
	
	@Rule
	public ExpectedException except = ExpectedException.none();
	
	@Test
	public void LaFuncionGetElevaUnaException(){


	}
	
}
