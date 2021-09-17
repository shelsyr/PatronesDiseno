package builderPattern;

public interface IBuilderCuenta extends IBuilderBanco{
	//Interfaz de productos Cuenta (Credito Debito)
	public void putDatosCuenta(String numeroCuenta, String direccion);//Parametros
	public void crearCuenta();
	public void putCuotaDeManejo(double cuotaManejo);
	public void realizarTransferencia();
}
