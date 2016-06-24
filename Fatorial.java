public class Fatorial{
		// Versão interativa do cálculo fatorial
		public int calcularFatorial(int n){
			int resultado = 1;
			if(n > 2){ //Se n for maior ou igual a 2
				for (int i = 2; i <= n; i++){
					resultado *= i;
					return resultado;
				}
			}
		}
	}
	
