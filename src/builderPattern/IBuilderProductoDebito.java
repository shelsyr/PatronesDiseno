package builderPattern;

public interface IBuilderProductoDebito extends IBuilderCuenta {
	//Interfaz Debito
	public void depositar();
	public void putImpuestos(double impuestos);
	
}
