package products.tarjetas.tarjetaDebito;

import builderPattern.IBuilderProductoDebito;

public interface IBuilderTarjetaDebito {
	//Interfaz Tarjeta Debito
	public void crearTarjeta(String nombreP, String fechaN, String Codigo, String fechaV);
}
