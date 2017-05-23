
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AsocArrayTest {


	private AsocArray al;
	
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

		except.expect(ExcepcionClave.class);
		except.expectMessage("Clave no encontrada");
		al.get("a");		
		
	}
	
	@Test
	public void ImplementacionDeLaOperacionGetOrElse(){
		al.put("primero","uno");
		assertEquals("uno",al.getOrElse("primero","defalut"));
		assertEquals("default",al.getOrElse("segundo","default"));
	}
	
	@Test
	public void ImplementacionDeLaOperacionContainsKey(){
		al.put("primero","uno");
		assertEquals(true,al.containsKey("primero"));
		assertEquals(false,al.containsKey("segundo"));
	}
	
	@Test
	public void ImplementacionDeLaOperacionRemove(){
		al.put("primero", "uno");
		al.put("segundo", "dos");
		al.put("tercero", "tres");
		assertEquals(true,al.remove("primero"));
		assertEquals(false,al.containsKey("primero"));
		assertEquals(true,al.remove("segundo"));
		assertEquals(false,al.containsKey("segundo"));
		assertEquals(true,al.containsKey("tercero"));
	}
	
	@Test
	public void EliminarUltimoElementoDeLaLista(){
		al.put("primero", "uno");
		al.put("segundo", "dos");
		al.put("tercero", "tres");
		assertEquals(true,al.remove("tercero"));
		assertEquals(false,al.containsKey("tercero"));
	}
	
	@Test
	public void CambiarValorExistente(){
		al.put("primero","uno");
		assertEquals("uno",al.get("primero"));
		al.put("primero","1");
		assertEquals("1",al.get("primero"));
		al.put("segundo","dos");
		assertEquals("dos",al.get("segundo"));
		al.put("segundo","2");
		assertEquals("2",al.get("segundo"));
	}
	
	@Test
	public void IntentoDeGetSobreElementoExistente() throws Exception {
		al.put("primero", "uno");
		al.put("segundo", "dos");
		al.put("tercero", "tres");
		assertEquals("uno",al.get("primero"));
		assertEquals("dos",al.get("segundo"));
		assertEquals("tres",al.get("tercero"));
	}
	
	
}
