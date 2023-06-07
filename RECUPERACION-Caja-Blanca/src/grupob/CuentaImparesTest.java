package grupob;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import grupob.CuentaImpares;

class CuentaImparesTest {

	@ParameterizedTest
	@MethodSource("caminos")
	void testCaminos(int num,int salida) {
		
		CuentaImpares ci= new CuentaImpares();
		
		//se llama al sumaNumeros de la clase de SumaNumeros
		int recoge= ci.cuentaImpares(num);
		
		
		//se mira el valor
		assertEquals(salida,recoge);
		
		
	}
	
	
	private static Stream<Arguments> caminos(){
		return Stream.of(
				Arguments.of(3,2),
				Arguments.of(2,1),
				Arguments.of(-1,0),
				Arguments.of(5,3)
				);
		
	}
}
