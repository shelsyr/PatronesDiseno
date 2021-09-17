package products.tarjetas.tarjetaCredito;

import java.util.HashMap;
import java.util.Random;

public class TarjetaCreditoBuilder implements IBuilderTarjetaCredito{
	private HashMap<String, String> datosTarjeta = new HashMap<String, String>();
	Random numR = new Random();
	String numTt = "", numTtLuhj = "";
	private TarjetaCredito Tcredito; 
	
	public void reset() {
		Tcredito = new TarjetaCredito();
	}
	
	@Override
	public void crearTarjeta(String nombreP, String fechaN, String Codigo, String fechaV) {
		numeroTarjeta();
		datosTarjeta.put("nombrePropietario", nombreP);
		datosTarjeta.put("numeroTarjeta", numTt);
		datosTarjeta.put("fechaN", fechaN);
		datosTarjeta.put("CodigoCVV", Codigo);
		datosTarjeta.put("fechaVencimiento", fechaV);
		Tcredito.setDatosTarjeta(datosTarjeta);
		
	}
	
	private void numeroTarjeta() {
		int aux = 0;
		//Crear Numero
		for(int i = 0; i < 15; i++) {
			numTt += Integer.toString(numR.nextInt(10));
		
		}
		
		//Luhj
		for(int i = 0; i<15; i++) {
			
			aux = numTt.charAt(i)-48;
			if((i+1)%2 == 0 ) {
				aux *= 1;
				numTtLuhj += Integer.toString(aux);
			}else {
				aux *= 2;
				
				if(aux >=10) {
					aux = 1+(aux%10);
				}
				numTtLuhj += Integer.toString(aux);
			}
		}
		
		comprobar();
	}
	
	private void comprobar() {
		int sum=0, NumLuhj;
		for(int i=0; i<15; i++) {
			sum += numTtLuhj.charAt(i)-48;
		}
		
		NumLuhj = 10 - (sum%10);
		sum+=NumLuhj;
		numTt += NumLuhj;
		
	}
	
	public TarjetaCredito getProduct() {
		return this.Tcredito;
	}
	
}
