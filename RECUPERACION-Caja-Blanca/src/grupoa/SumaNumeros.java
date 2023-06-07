package grupoa;

public class SumaNumeros {

	public int sumaNumeros(int num) {
		int suma = 0;
		//se cambia i<num por i<=num
		for (int i = 1; i <= num; i++) {
			if(i%2==0) {
				suma += i;
			}
		}
		return suma;
	}
}
