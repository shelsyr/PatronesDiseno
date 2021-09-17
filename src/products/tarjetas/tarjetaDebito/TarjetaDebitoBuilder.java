package products.tarjetas.tarjetaDebito;

import java.util.HashMap;
import java.util.Random;


public class TarjetaDebitoBuilder implements IBuilderTarjetaDebito{
	private HashMap<String, String> datosTarjeta = new HashMap<String, String>();
	Random numR = new Random();
	String numTt = "", numTtLuhj = "";
	
	private TarjetaDebito tDebito;
	
	private TarjetaDebitoBuilder() {
		System.out.println("Se ha creado la tarjeta!");
	}
	
	public TarjetaDebito getTarjeta() {
		if(tDebito==null) {	
			tDebito = new TarjetaDebito();
		}
	return tDebito;
	}
	
	public void reset() {
			tDebito = new TarjetaDebito();
		
	}
	
	@Override
	public void crearTarjeta(String nombreP, String fechaN, String Codigo, String fechaV) {
		numeroTarjeta();
		datosTarjeta.put("nombrePropietario", nombreP);
		datosTarjeta.put("numeroTarjeta", numTt);
		datosTarjeta.put("fechaN", fechaN);
		datosTarjeta.put("CodigoCVV", Codigo);
		datosTarjeta.put("fechaVencimiento", fechaV);
		tDebito.setDatosTarjeta(datosTarjeta);
		
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
	
	public TarjetaDebito getProduct() {
		return this.tDebito;
	}
	
}
