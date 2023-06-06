package grupoa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumaNumerosTest {

	@ParameterizedTest
	@MethodSource("caminos")
	void testCaminos(int num,int salida) {
		
		SumaNumeros sumanumeros= new SumaNumeros();
		
		//se llama al sumaNumeros de la clase de SumaNumeros
		int recoge= sumanumeros.sumaNumeros(num);
		
		
		//se mira el valor
		assertEquals(salida,recoge);
		
		
	}
	
	
	private static Stream<Arguments> caminos(){
		return Stream.of(
				Arguments.of(2,2),
				Arguments.of(1,0),
				Arguments.of(-1,0),
				Arguments.of(4,6)
				);
		
	}
	
	
	
	
}













//crear el objeto
//SumaNumeros suma=new SumaNumeros();
