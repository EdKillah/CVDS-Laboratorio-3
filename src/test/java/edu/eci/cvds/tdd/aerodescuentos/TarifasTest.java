
package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.*;


public class TarifasTest {
	private CalculadorDescuentos c = new CalculadorDescuentos();
	@Test
	public void validarTarifaMenorEdad(){
		
		Assert.assertEquals(5000.0,c.calculoTarifa(5000,9,18),0.5);
		Assert.assertEquals(4750.0,c.calculoTarifa(5000,10,16),0.5);
		Assert.assertEquals(4750.0,c.calculoTarifa(5000,10,17),0.5);
		Assert.assertEquals(5000.0,c.calculoTarifa(5000,10,19),0.5);
	}

	@Test
	public void validarTarifaMayorEdad(){
		Assert.assertEquals(5000.0,c.calculoTarifa(5000,9,65),0.5);
		Assert.assertEquals(4600.0,c.calculoTarifa(5000,15,66),0.5);
		Assert.assertEquals(4600.0,c.calculoTarifa(5000,15,67),0.5);
		Assert.assertEquals(5000.0,c.calculoTarifa(5000,7,64),0.5);
	}


	@Test
	public void validarDiasAntelacion(){
		Assert.assertEquals(5000.0,c.calculoTarifa(5000,20,20),0.5);
		Assert.assertEquals(4250.0,c.calculoTarifa(5000,21,35),0.5);
		Assert.assertEquals(4250.0,c.calculoTarifa(5000,22,35),0.5);
		Assert.assertEquals(5000.0,c.calculoTarifa(5000,19,40),0.5);
	}
}