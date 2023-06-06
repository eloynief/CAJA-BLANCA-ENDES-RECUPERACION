package grupob;

public class CuentaImpares {

	public int cuentaImpares(int num) {
		int cuenta = 0;
		for (int i = 1; i < num; i++) {
			if (i % 2 == 1) {
				cuenta++;
			}
		}
		return cuenta;
	}
}
